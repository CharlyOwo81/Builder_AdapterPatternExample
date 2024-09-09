/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arq.builderPattern;

/**
 *
 * @author gamaliel
 */
public class Flower {
    private String petalColour;
    private boolean hasThorns;
    private int stemHeight;
    private int flowersQuantity;

    // Constructor privado para evitar que se creen flores sin Builder
    private Flower(String petalColour, boolean hasThorns, int stemHeight, int flowersQuantity) {
        this.petalColour = petalColour;
        this.hasThorns = hasThorns;
        this.stemHeight = stemHeight;
        this.flowersQuantity = flowersQuantity;
    }

    @Override
    public String toString() {
        return flowersQuantity + " flower/s with " + petalColour + " petals, " 
                + (hasThorns ? "with thorns" : "without thorns")
                + " and a " + stemHeight + " cm long stem.";
    }

    // Clase Builder que construye la flor paso a paso
    static class FlowerBuilder {

        private String petalColour;
        private boolean hasThorns;
        private int stemHeight;
        private int flowersQuantity;

        // Establecer el color de los pétalos
        public FlowerBuilder setPetalColour(String petalColour) {
            this.petalColour = petalColour;
            return this;
        }

        // Establecer si tiene espinas
        public FlowerBuilder setHasThorns(boolean hasThorns) {
            this.hasThorns = hasThorns;
            return this;
        }

        // Establecer la altura del tallo
        public FlowerBuilder setStemHeight(int stemHeight) {
            this.stemHeight = stemHeight;
            return this;
        }

        // Establecer la altura del tallo
        public FlowerBuilder setFlowersQuantity(int flowersQuantity) {
            this.flowersQuantity = flowersQuantity;
            return this;
        }

        // Método para construir la flor final
        public Flower build() {
            return new Flower(petalColour, hasThorns, stemHeight, flowersQuantity);
        }
    }
}


