package factory;

public class Sony implements Mobile {

    private int ramSize;
    private String processor;

    public Sony(int ramSize, String processor) {
        this.ramSize = ramSize;
        this.processor = processor;
    }

    @Override
    public String imprimir() {
        String r = "Procesador: " + this.processor + " ram: " + this.ramSize+" gb";
        return r;
    }
}
