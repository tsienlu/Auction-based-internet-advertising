/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Purchase;

import Business.Payment.Payment;
import Ecosystem.AdvertiserProduct;

/**
 *
 * @author varsha
 */
public class AdvertiserOrder {

    private AdvertiserProduct advertiserProduct;
    private static int count = 1;
    private int AdvertiserOrderId;
    private float orderAmount;
    private Payment payment;

    public AdvertiserOrder() {

        Payment payment = new Payment();
        count = AdvertiserOrderId;
        count++;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public AdvertiserProduct getAdvertiserProduct() {
        return advertiserProduct;
    }

    public void setAdvertiserProduct(AdvertiserProduct advertiserProduct) {
        this.advertiserProduct = advertiserProduct;
    }

    public int getAdvertiserOrderId() {
        return AdvertiserOrderId;
    }

    public void setAdvertiserOrderId(int AdvertiserOrderId) {
        this.AdvertiserOrderId = AdvertiserOrderId;
    }

}
