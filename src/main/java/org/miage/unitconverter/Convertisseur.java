package org.miage.unitconverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sébastien
 */
import java.math.BigDecimal;
import java.util.HashMap;


public class Convertisseur {

    
    public BigDecimal convert(String depart, BigDecimal in, HashMap<String, BigDecimal> coef, String arrive){
        if (coef.containsKey(depart) && coef.containsKey(arrive)){
            if (!in.equals(BigDecimal.ZERO)){
                return convertReferenceToOut(arrive, coef, convertInToReference(depart, coef, in));
            }            
        }
        return null;       
    }
    
    public BigDecimal convertInToReference(String name, HashMap<String, BigDecimal> coef, BigDecimal in){
        if(coef != null && coef.get(name) != null){
            return in.divide(coef.get(name));
        }
        return null;
    }
    
    public BigDecimal convertReferenceToOut(String name,HashMap<String, BigDecimal> coef,  BigDecimal in){
        return coef.get(name).multiply(in);
    }
}
