package com.example.johnd.monsterfight;

/**
 * Created by JohnD on 01/11/2017.
 */

public class GiantShrimpSalmonEel extends GiantMonster {

    public GiantShrimpSalmonEel(String name, Double healthValue, Double attackValue) {
        super(
                name,
                healthValue,
                attackValue
        );
    }

    protected String roar() {
        return ("guuurp");
    }

    protected String move() {
        return ("Saunters");
    }

}
