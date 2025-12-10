package com.example.praktikummodul7;

public class RegularStudent extends Student {
    private int totalSKS;
    private double totalUKT;


    public RegularStudent(String name, long id, int totalSKS, Payment paymentLogic) {
        super(name, id);
        this.totalSKS = totalSKS;
        this.totalUKT = paymentLogic.pay(totalSKS);
    }

    @Override
    public int getTotalSKS() {
        return totalSKS;
    }

    @Override
    public double getTotalUKT(){
        return totalUKT;
    }
}
