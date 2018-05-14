package factory;

public class IPhone implements Mobile {

    private int ramSize;
    private String processor;
    private String GPU;

    public IPhone(int ramSize, String processor, String GPU) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.GPU = GPU;
    }

    @Override
    public String imprimir() {
        String r = "Procesador: " + this.processor + " ram: " + this.ramSize + "gb GPU: " + this.GPU;
        return r;
    }
}
