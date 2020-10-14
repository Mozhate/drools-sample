package com.laher.drools.supermarket.service;

import com.laher.drools.supermarket.entity.Order;
import org.kie.api.KieServices;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.runtime.ExecutionResults;
import org.kie.api.runtime.KieSession;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.RuleServicesClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * 订单服务
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/14
 */
@Service
public class OrderService {
    // @Resource
    private KieSession kieSession;

    @Resource
    private KieServicesClient kieServicesClient;

    private final static String CONTAINER_ID = "drools-supermarket_1.0.0-SNAPSHOT";

    /**
     * 购买
     * 
     * @param order 订单
     */
    public void buy(Order order) {
        kieSession.insert(order);
        kieSession.fireAllRules();
    }

    public void remoteBuy(Order order) {

        // 执行命令
        KieCommands kieCommands = KieServices.Factory.get().getCommands();
        List<Command<?>> commands = new LinkedList<Command<?>>();
        commands.add(kieCommands.newInsert(order, "Order"));
        commands.add(kieCommands.newFireAllRules());

        RuleServicesClient ruleServicesClient = kieServicesClient.getServicesClient(RuleServicesClient.class);
        ServiceResponse<ExecutionResults> results = ruleServicesClient.executeCommandsWithResults(CONTAINER_ID,
            kieCommands.newBatchExecution(commands, "ksession1"));

        Order res = (Order)results.getResult().getValue("Order");

        System.out.println(res.toString());
    }
}
