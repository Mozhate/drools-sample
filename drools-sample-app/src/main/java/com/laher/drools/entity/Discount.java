package com.laher.drools.entity;

/**
 * 配置
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/15
 */
public class Discount {

    /** 价格 **/
    private Integer money;
    /** 优惠金额 **/
    private Integer preferential;

    public Discount() {
    }

    public Discount(Integer money, Integer preferential) {
        this.money = money;
        this.preferential = preferential;
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
}
