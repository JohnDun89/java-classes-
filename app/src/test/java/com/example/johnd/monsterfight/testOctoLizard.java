package com.example.johnd.monsterfight;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by JohnD on 01/11/2017.
 */

public class testOctoLizard {
    OctoLizard octoLizard;
    Submarine submarine;

    @Before
    public void before() {
        octoLizard = new OctoLizard("Terry",5.0,1.0);
        submarine = new Submarine("Red October",10.0);
    }

    @Test
    public void canRoar() {
        assertEquals("buuu", octoLizard.roar());
    }

   @Test
    public void canAttack(){
       octoLizard.attackVechile(submarine);
        assertEquals(9.0, submarine.getHealth(), 0.1);

    }

    @Test
    public void monsterCanMove(){
        assertEquals("Slither", octoLizard.move());
    }



}
