/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arq.adapterPattern;

/**
 *
 * @author gamaliel
 */
public class FlowerAdapter extends CommonFlower {
    private SpecialFlower specialFlower;

    public FlowerAdapter(SpecialFlower specialFlower) {
        super("Special Flower Adapter");
        this.specialFlower = specialFlower;
    }

    @Override
    public String getName() {
        specialFlower.placeInSpecialPot();
        return "Adapted Flower";
    }
}
