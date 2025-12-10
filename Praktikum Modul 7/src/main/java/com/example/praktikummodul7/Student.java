package com.example.praktikummodul7;

public abstract class Student {
    private String name;
    private long id;


    public Student (String name, long id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public long getId(){
        return id;
    }

    public abstract double getTotalUKT();
    public abstract int getTotalSKS();
}
