package com.laher.test;

import com.laher.drools.supermarket.entity.Order;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * 测验
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/14
 */
public class Test {
    public static void main(String[] args) {
        new Test().demo1();
    }

    public void demo1() {
        // 获取服务
        KieServices kieServices = KieServices.Factory.get();
        // 获取类路径的配置项
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        // 获取ksession1规则的会话
        KieSession kieSession = kieContainer.newKieSession("ksession1");

        // 创造数据：超过200-30 不超过则无优惠
        Order order1 = new Order(200);

        kieSession.insert(order1);

        // 执行会话
        kieSession.fireAllRules();

        System.out.println(order1.toString());
    }
}
