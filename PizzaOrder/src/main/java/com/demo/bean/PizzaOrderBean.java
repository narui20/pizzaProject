package com.demo.bean;

public class PizzaOrderBean {
    private  int orderId;
    private int pizzaId;
    private  String contactNo;
    private String customerName;
    private  double bill;
    private  int noOfPieces;

    public PizzaOrderBean() {
        super();
    }

    public PizzaOrderBean(int orderId, int pizzaId, String contactNo, String customerName, double bill, int noOfPieces) {
        super();
        this.orderId = orderId;
        this.pizzaId = pizzaId;
        this.contactNo = contactNo;
        this.customerName = customerName;
        this.bill = bill;
        this.noOfPieces = noOfPieces;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getNoOfPieces() {
        return noOfPieces;
    }

    public void setNoOfPieces(int noOfPieces) {
        this.noOfPieces = noOfPieces;
    }
}
