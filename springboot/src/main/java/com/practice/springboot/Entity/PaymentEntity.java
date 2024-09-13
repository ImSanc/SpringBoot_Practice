package com.practice.springboot.Entity;

public class PaymentEntity {
    private Long id;
    private double paymentAmount;
    private String paymentCurrency;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public double getPaymentAmount(){
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount){
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentCurrency(){
        return paymentCurrency;
    }

    public void setPaymentCurrency( String paymentCurrency){
        this.paymentCurrency = paymentCurrency;
    }
}
