package com.example.praktikummodul7;

public class RegularPaymentLogic implements Payment {

    @Override
    public double pay(int totalSKS) {
        return totalSKS*250000;
    }
}
