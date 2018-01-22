/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Purchase;


import Business.Payment.Payment;
import Ecosystem.Customer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author varsha
 */
public class Order {
    
    private ArrayList<OrderItem> orderItemList;
    private static int count = 0;
    private int orderId;
    private String dt;
    private Date date;
    private Customer customer;
    private String status;
    private Payment p;
    
    
    SimpleDateFormat sf =  new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
    
    public Order(){
        count++;
        orderId = count;
        status = "Pending";
        p=new Payment();
        date = Calendar.getInstance().getTime();
        dt = sf.format(date);
        orderItemList = new ArrayList<OrderItem>();
        
    }

    public Payment getP() {
        return p;
    }

    public void setP(Payment p) {
        this.p = p;
    }
    
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    
    
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public OrderItem addOrderItem(){
        
        OrderItem oi = new OrderItem();
        orderItemList.add(oi);
        return oi;
    }
    
    public void removeOrderItem(OrderItem oi){
        
        orderItemList.remove(oi);
    }
}
