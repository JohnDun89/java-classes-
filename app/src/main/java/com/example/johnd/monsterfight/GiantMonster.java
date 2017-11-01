package com.example.johnd.monsterfight;

/**
 * Created by JohnD on 01/11/2017.
 */

public abstract class GiantMonster {
    private String name;
    private Double healthValue;
    private Double attackValue;

    public GiantMonster(String name, Double healthValue, Double attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }
    public String getName(){
        return this.name;
    }

    public Double getHealth(){
        return this.healthValue;
    }

    public Double getAttackValue() {
        return this.attackValue;
    }



   public Double attackVechile(Vehicle vehicle) {
       return vehicle.damageVechile(this.attackValue);

    }
}
