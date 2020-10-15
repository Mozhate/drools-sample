package com.laher.test;

import com.laher.drools.supermarket.SuperApplication;
import com.laher.drools.supermarket.entity.Disconfig;
import com.laher.drools.supermarket.entity.Item;
import com.laher.drools.supermarket.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.runtime.ExecutionResults;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.RuleServicesClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author laher
 * @date 2020/10/15/015
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SuperApplication.class)
public class TestRemoteSpring {
    @Resource
    private KieServicesClient kieServicesClient;

    private final static String CONTAINER_ID = "drools-sample-supermarket_1.0.0-SNAPSHOT";

    @Test
    public void rule2() {
        Item item1 = new Item("娃哈哈", 100);
        Item item2 = new Item("天地一号", 700);
        Order order = new Order();
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        order.setItems(items);

//        Disconfig disconfig = new Disconfig(400,50);
//        Order order = new Order(200);

        // 执行命令
        KieCommands kieCommands = KieServices.Factory.get().getCommands();
        List<Command<?>> commands = new LinkedList<Command<?>>();
        commands.add(kieCommands.newInsert(order, "Order"));
//        commands.add(kieCommands.newInsert(disconfig));
        commands.add(kieCommands.newFireAllRules());

        RuleServicesClient ruleServicesClient = kieServicesClient.getServicesClient(RuleServicesClient.class);
        ServiceResponse<ExecutionResults> results = ruleServicesClient.executeCommandsWithResults(CONTAINER_ID,
                kieCommands.newBatchExecution(commands, "ksession1"));

        System.out.println(results.getMsg());
        Order res = (Order)results.getResult().getValue("Order");

        System.out.println(res.toString());
    }

}
