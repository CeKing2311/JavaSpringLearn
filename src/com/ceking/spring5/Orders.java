package com.ceking.spring5;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:12
 */
public class Orders {
    private String orderId;
    private String address;

    public Orders(String orderId, String address) {
        this.orderId = orderId;
        this.address = address;
    }

    public void showOrder() {
        System.out.println("当前订单：" + orderId + ",收货地址：" + address);
    }
}
