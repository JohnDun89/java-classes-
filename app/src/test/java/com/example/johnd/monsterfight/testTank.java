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
}