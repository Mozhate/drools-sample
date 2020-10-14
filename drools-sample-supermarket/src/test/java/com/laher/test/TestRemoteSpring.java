package com.laher.test;

import com.laher.drools.supermarket.SuperSpringBootApplication;
import com.laher.drools.supermarket.entity.Order;
import com.laher.drools.supermarket.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 远程调用
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SuperSpringBootApplication.class)
public class TestRemoteSpring {
    @Resource
    private OrderService orderService;

    @Test
    public void remoteDemo() {
        orderService.remoteBuy(new Order(200));
    }
}
