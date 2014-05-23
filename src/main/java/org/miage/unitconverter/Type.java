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


public class Type {

    private String nom;
    private HashMap<String, BigDecimal> coefList;
    private String refName;
    
    public void setCoef(HashMap<String, BigDecimal> coef) {
        this.coefList = coef;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public HashMap<String, BigDecimal> getCoef() {
        return coefList;
    }
    public Type(String nom, String refName) {
        this.nom = nom;
        this.refName = refName;
        this.coefList = new HashMap<String, BigDecimal>();
        this.coefList.put(this.refName, BigDecimal.ONE);
    }
    
    public boolean addCoef(String nom, int coef){
        if (nom != null && !nom.equals("")){
            if(this.coefList != null){
                this.coefList.put(nom, BigDecimal.valueOf(coef));
                return true;
            }
        }
        return false;
    }
}
