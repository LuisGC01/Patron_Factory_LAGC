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
public class Lg implements Mobile {

    private int ramSize;
    private String processor;
    private int camara;

    public Lg(int ramSize, String processor, int camara) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.camara = camara;
    }

    @Override
    public String imprimir() {
        String r = "Procesador: " + this.processor + " ram: " + this.ramSize + "gb Camara: " + this.camara;
        return r;
    }

}
