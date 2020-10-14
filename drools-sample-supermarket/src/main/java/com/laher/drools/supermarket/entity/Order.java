//package com.laher.drools.supermarket.entity;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * 订单
// *
// * @author laher
// * @date 2020/10/14/014
// */
//public class Order {
//    /** 价格 **/
//    private Integer money;
//    /** 优惠金额 **/
//    private Integer preferential;
//    /** 实际支付 **/
//    private Integer actual;
//    /** 商品列表 **/
//    private List<Item> items = new ArrayList<>();
//
//    public Order() {}
//
//    public Order(Integer money) {
//        this.money = money;
//    }
//
//    public Integer getMoney() {
//        return money;
//    }
//
//    public void setMoney(Integer money) {
//        this.money = money;
//    }
//
//    public Integer getPreferential() {
//        return preferential;
//    }
//
//    public void setPreferential(Integer preferential) {
//        this.preferential = preferential;
//    }
//
//    public Integer getActual() {
//        return actual;
//    }
//
//    public void setActual(Integer actual) {
//        this.actual = actual;
//    }
//
//    @Override
//    public String toString() {
//        return "Order{" + "money=" + money + ", preferential=" + preferential + ", actual=" + actual + '}';
//    }
//
//    public List<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }
//
//    public void addItem(Item ... items) {
//        this.items = Arrays.asList(items);
//    }
//}
