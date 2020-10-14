package com.laher.test;

import com.laher.drools.supermarket.entity.Order;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author laher
 * @date 2020/10/14/014
 */
public class Test {

    public static void main(String[] args) {
        new Test().rule1();
    }

    private void rule1() {
        // 获取kieService环境对象
        KieServices kieServices = KieServices.Factory.get();
        // 获取类路径kmodule.xml下配置
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        // 获取会话
        KieSession kieSession = kieContainer.newKieSession("ksession1");

        Order order = new Order(800);

        kieSession.insert(order);

        // 执行会话
        kieSession.fireAllRules();

        System.out.println(order.toString());
    }
}
