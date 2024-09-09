/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arq.adapterPatternV2;

import org.itson.arq.adapterPattern.*;

/**
 *
 * @author gamaliel
 */
public class SpecialFlower implements Flower{
    private String name;

    public SpecialFlower(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
    public void placeInSpecialPot() {
        System.out.println("Special flower placed in a special pot.");
    }
}
