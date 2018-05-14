/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author LUIS
 */
public class Motorola implements Mobile {

    private int ramSize;
    private String processor;
    private String color;

    public Motorola(int ramSize, String processor, String color) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.color = color;
    }

    @Override
    public String imprimir() {
        String r = "Procesador: " + this.processor + " ram: " + this.ramSize + "gb Color: " + this.color;
        return r;
    }
}
