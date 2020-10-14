package com.laher.drools.supermarket.entity;

/**
 * 商品
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/14
 */
public class Item {
    /** 名称 **/
    private String name;
    /** 金额 **/
    private Integer money;

    public Item() {}

    public Item(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
