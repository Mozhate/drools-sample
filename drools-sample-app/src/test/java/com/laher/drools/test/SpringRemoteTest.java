//package com.laher.drools.test;
//
//import com.laher.drools.DroolsApplication;
//import com.laher.drools.entity.Discount;
//import com.laher.drools.entity.Order;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.kie.api.KieServices;
//import org.kie.api.command.Command;
//import org.kie.api.command.KieCommands;
//import org.kie.api.runtime.ExecutionResults;
//import org.kie.server.api.model.ServiceResponse;
//import org.kie.server.client.KieServicesClient;
//import org.kie.server.client.RuleServicesClient;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * 远程测试
// * <p>
// *
// * @author laher
// * @version 1.0.0
// * @date 2020/10/15
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = DroolsApplication.class)
//public class SpringRemoteTest {
//
//    @Resource
//    private KieServicesClient kieServicesClient;
//
//    private final static String CONTAINER_ID = "drools-sample-app_1.0.0-SNAPSHOT";
//
//    @Test
//    public void demo() {
//        Order order = new Order();
//        order.setMoney(200);
//
//        Discount discount = new Discount();
//        discount.setMoney(200);
//        discount.setPreferential(20);
//
//        KieCommands kieCommands = KieServices.Factory.get().getCommands();
//        List<Command> commands = new LinkedList<>();
//        commands.add(kieCommands.newInsert(order, "order"));
//        commands.add(kieCommands.newInsert(discount));
//
//        RuleServicesClient ruleServicesClient = kieServicesClient.getServicesClient(RuleServicesClient.class);
//        ServiceResponse<ExecutionResults> result = ruleServicesClient.executeCommandsWithResults(CONTAINER_ID,
//            kieCommands.newBatchExecution(commands, "ksession1"));
//
//        Order res = (Order)result.getResult().getValue("order");
//
//        System.out.println("金额 " + res.getMoney());
//        System.out.println("优惠 " + res.getPreferential());
//        System.out.println("实际 " + res.getActual());
//    }
//
//}
