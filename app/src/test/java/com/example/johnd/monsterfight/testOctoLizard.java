package com.example.johnd.monsterfight;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by JohnD on 01/11/2017.
 */

public class testOctoLizard {
    OctoLizard octoLizard;

    @Before
    public void before() {
        octoLizard = new OctoLizard("Terry",5.0,1.3);
    }

    @Test
    public void canRoar() {
        assertEquals("buuu", octoLizard.roar());
    }


}
