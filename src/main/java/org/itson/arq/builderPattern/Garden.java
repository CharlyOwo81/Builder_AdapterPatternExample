/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.arq.builderPattern;

/**
 *
 * @author gamaliel
 */
public class Garden {

    public static void main(String[] args) {
        // Creamos una rosa paso a paso usando el patrón Builder
        Flower rose = new Flower.FlowerBuilder()
                .setPetalColour("red")
                .setHasThorns(true)
                .setStemHeight(30)
                .setFlowersQuantity(7)
                .build();

        System.out.println(rose);

        // Creamos un girasol paso a paso
        Flower sunflower = new Flower.FlowerBuilder()
                .setPetalColour("yellow")
                .setHasThorns(false)
                .setStemHeight(25).
                setFlowersQuantity(1)
                .build();
        
        System.out.println(sunflower);

    }
}
