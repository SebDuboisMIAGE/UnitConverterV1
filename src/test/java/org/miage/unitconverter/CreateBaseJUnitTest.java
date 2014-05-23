package org.miage.unitconverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.miage.unitconverter.Type;
import java.math.BigDecimal;
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
public class CreateBaseJUnitTest {
    
    public CreateBaseJUnitTest() { }
            
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
    public void createType() {
        String name = "longueur";
        String ref = "m";
        Type type = new Type(name,ref);
        assertNotNull(type);
        assertEquals(name, type.getNom());
        assertNotNull(type.getCoef());
        assertEquals(BigDecimal.ONE, type.getCoef().get(ref));
    }
}
