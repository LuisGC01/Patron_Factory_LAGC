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
public class Alcatel implements Mobile {

    private int ramSize;
    private String processor;
    private int memoria;

    public Alcatel(int ramSize, String processor, int memoria) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.memoria = memoria;
    }

    @Override
    public String imprimir() {
        String r = "Procesador: " + this.processor + " ram: " + this.ramSize + " gb Memoria interna: " + this.memoria+" gb";
        return r;
    }

}
