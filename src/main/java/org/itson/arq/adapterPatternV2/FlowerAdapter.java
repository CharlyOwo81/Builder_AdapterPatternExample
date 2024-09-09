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
public class FlowerAdapter implements Flower{
    private SpecialFlower specialFlower;

    public FlowerAdapter(SpecialFlower specialFlower) {
        this.specialFlower = specialFlower;
    }

    @Override
    public String getName() {
        specialFlower.placeInSpecialPot();
        return specialFlower.getName();
    }
}
