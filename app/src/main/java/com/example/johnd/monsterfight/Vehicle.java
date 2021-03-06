package com.example.johnd.monsterfight;

/**
 * Created by JohnD on 01/11/2017.
 */

public abstract class Vehicle {

    private String type;
    private Double health;

    public Vehicle(String type, Double health){
        this.type = type;
        this.health = health;
    }

    public String getType(){
        return this.type;
    }

    public Double getHealth(){
        return this.health;
    }

    public Double damageVechile(Double amount){
        return this.health -= amount;
    }
}
