package com.example.johnd.monsterfight;


import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;


/**
 * Created by JohnD on 01/11/2017.
 */

public class testGiantShrimpSalmonEel {
    GiantShrimpSalmonEel specemin;

    @Before
    public void before(){
        specemin = new GiantShrimpSalmonEel("Tim",8.5,2.0);
    }

    @Test
    public void speceminHasName(){
        assertEquals("Tim", specemin.getName());
    }

    @Test
    public void speceminCanRoar(){
     assertEquals("guuurp", specemin.roar());

    }
}
