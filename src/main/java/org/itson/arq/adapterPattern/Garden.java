/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.arq.adapterPattern;

/**
 *
 * @author gamaliel
 */
public class Garden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Standard pot
        StandardPot pot = new StandardPot();

        // Common flower
        CommonFlower rose = new CommonFlower("Rose");
        pot.placeCommonFlower(rose); // Place a common flower

        // Special flower with an adapter
        SpecialFlower specialOrchid = new SpecialFlower();
        CommonFlower adaptedFlower = new FlowerAdapter(specialOrchid);

        // Place the special flower using the adapter
        pot.placeCommonFlower(adaptedFlower);
    }
    
}
