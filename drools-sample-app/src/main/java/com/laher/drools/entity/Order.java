package com.laher.drools.entity;

/**
 * 订单
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/15
 */
public class Order {
    /** 价格 **/
    private Integer money;
    /** 优惠金额 **/
    private Integer preferential;
    /** 实际支付 **/
    private Integer actual;

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

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }
}
