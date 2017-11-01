package com.example.johnd.monsterfight;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by JohnD on 01/11/2017.
 */

public class testTank {
    Tank tank;

    @Before
    public void before() {
        tank = new Tank("Challanger 2",8.0);
    }

    @Test
    public void tankType(){
        assertEquals("Challanger 2", tank.getType());
    }

    @Test
    public void tankHealth(){
        assertEquals(8.0, tank.getHealth(), 0.1);
    }

    @Test
    public void testDamageVehicle(){
        assertEquals(7.0, tank.damageVechile(1.0),0.1);
    }
}
