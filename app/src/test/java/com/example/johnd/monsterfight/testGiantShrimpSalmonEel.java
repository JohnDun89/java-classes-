package com.example.johnd.monsterfight;


import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;


/**
 * Created by JohnD on 01/11/2017.
 */

public class testGiantShrimpSalmonEel {
    GiantShrimpSalmonEel specemin;
    Tank tank;

    @Before
    public void before(){
        specemin = new GiantShrimpSalmonEel("Tim",8.5,2.0);
        tank = new Tank("Challanger 2",8.0);
    }

    @Test
    public void speceminHasName(){
        assertEquals("Tim", specemin.getName());
    }

    @Test
    public void speceminCanRoar(){
     assertEquals("guuurp", specemin.roar());

    }

    @Test
    public void monsterCanAttackVechile() {
        specemin.attackVechile(tank);
        assertEquals(6.0, tank.getHealth(), 0.1);
    }
}
