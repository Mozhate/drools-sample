package com.laher.drools.test;

import com.laher.drools.entity.Order;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * 测试
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/15
 */
public class Test {
    public static void main(String[] args) {
        new Test().demo();
    }
    public void demo(){
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("ksession1");

        Order order = new Order();
        order.setMoney(100);
        kieSession.insert(order);
        kieSession.fireAllRules();
        
        System.out.println("金额 "+order.getMoney());
        System.out.println("优惠 "+order.getPreferential());
        System.out.println("实际 "+order.getActual());
    }
}
