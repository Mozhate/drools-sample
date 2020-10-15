package com.laher.test;

import com.laher.drools.supermarket.SuperApplication;
import com.laher.drools.supermarket.entity.Disconfig;
import com.laher.drools.supermarket.entity.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.laher.drools.supermarket.entity.Order;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author laher
 * @date 2020/10/14/014
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SuperApplication.class)
public class TestSpring {

    @Resource
    private KieSession kieSession;

    @Test
    public void rule2() {
        Order order = new Order(800);

        kieSession.insert(order);

        // 执行会话
        kieSession.fireAllRules();

        System.out.println(order.toString());
    }

    @Test
    public void rule3() {
        Item item1 = new Item("娃哈哈", 100);
        Item item2 = new Item("天地一号", 700);
        Order order = new Order();
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        order.setItems(items);
        Disconfig disconfig = new Disconfig(400,50);

        kieSession.insert(order);
        kieSession.insert(disconfig);

        // 执行会话
        kieSession.fireAllRules();

        System.out.println(order.toString());
    }
}
