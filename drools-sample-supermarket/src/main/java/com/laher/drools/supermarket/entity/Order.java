package com.laher.drools.supermarket.entity;

/**
 * 订单
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/14
 */
public class Order {
    /** 价格 **/
    private Integer money;
    /** 优惠 **/
    private Integer preferential;
    /** 支付 **/
    private Integer pay;

    public Order() {}

    public Order(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getPreferential() {
        return preferential;
    }

    public void setPreferential(Integer preferential) {
        this.preferential = preferential;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Order{" + "money=" + money + ", preferential=" + preferential + ", pay=" + pay + '}';
    }
}
