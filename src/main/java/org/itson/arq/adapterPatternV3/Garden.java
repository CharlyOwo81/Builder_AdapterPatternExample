/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.arq.adapterPatternV3;

import org.itson.arq.adapterPattern.*;

/**
 *
 * @author gamaliel
 */
public class Garden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StandardPot pot = new StandardPot();

        Flower rose = new CommonFlower("Rose");
        pot.placeFlower(rose);

        Flower specialSunflower = new FlowerAdapter(new SpecialFlower("Sunflower"));
        pot.placeFlower(specialSunflower);
    }
}
