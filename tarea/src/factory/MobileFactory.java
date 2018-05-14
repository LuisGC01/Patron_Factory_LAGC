package factory;

public class MobileFactory {

    public static Mobile createMobile(String type) {
        if (type.equals(Mobile.IPHONE)) {
            return new IPhone(2, "A9", "A9 GPu");
        } else if (type.equals(Mobile.SONY)) {
            return new Sony(2, "ARM");
        } else if (type.equals(Mobile.SAMSUNG)) {
            return new Samsung("Intel");
        } else if (type.equals(Mobile.MOTOROLA)) {
            return new Motorola(3, "ARM", "AZUL");
        } else if (type.equals(Mobile.ALCATEL)) {
            return new Alcatel(1, "SNAPDRAGON", 8);
        } else if (type.equals(Mobile.LG)) {
            return new Lg(2, "ADRENO", 16);
        } else {
            return null;
        }
    }
}
