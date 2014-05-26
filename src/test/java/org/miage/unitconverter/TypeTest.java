package org.miage.unitconverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sébastien
 */
public class TypeTest {
    
    public TypeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void ajoutCoef(){
        Type type = new Type("longueur", "m");
        type.addCoef("km", BigDecimal.valueOf(0.1));
        assertTrue(type.getCoef().containsKey("km"));
    }
    
    @Test
    public void ChangementNom(){
        Type type = new Type("longueur", "m");
        type.addCoef("km", BigDecimal.valueOf(0.1));
        type.setNom("distance");
        assertTrue(type.getNom().equalsIgnoreCase("distance"));
    }
    
    @Test
    public void RecupererNom(){
        Type type = new Type("longueur", "m");
        assertTrue(type.getNom().equalsIgnoreCase("longueur"));
    }
    
}
