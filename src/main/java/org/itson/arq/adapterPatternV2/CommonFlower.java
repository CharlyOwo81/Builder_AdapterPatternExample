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
public class CommonFlower implements Flower{
    private String name;

    public CommonFlower(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
