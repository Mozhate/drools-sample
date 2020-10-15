//package com.laher.drools.test;
//
//import com.laher.drools.DroolsApplication;
//import com.laher.drools.entity.Discount;
//import com.laher.drools.entity.Order;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.kie.api.runtime.KieSession;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//
///**
// * spring测试
// * <p>
// *
// * @author laher
// * @version 1.0.0
// * @date 2020/10/15
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = DroolsApplication.class)
//public class SpringTest {
//    @Resource
//    private KieSession kieSession;
//
//    @Test
//    public void demo(){
//        Order order = new Order();
//        order.setMoney(200);
//
//        Discount discount = new Discount();
//        discount.setMoney(200);
//        discount.setPreferential(20);
//
//        kieSession.insert(order);
//        kieSession.insert(discount);
//        kieSession.fireAllRules();
//
//        System.out.println("金额 "+order.getMoney());
//        System.out.println("优惠 "+order.getPreferential());
//        System.out.println("实际 "+order.getActual());
//    }
//}
