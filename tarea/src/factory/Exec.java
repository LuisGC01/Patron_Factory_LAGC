package factory;

public class Exec {
	 public static void main(String[] args) {
		Mobile mobile1 = MobileFactory.createMobile(Mobile.SAMSUNG);
                Mobile mobile2= MobileFactory.createMobile(Mobile.ALCATEL);
                Mobile mobile3 = MobileFactory.createMobile(Mobile.IPHONE);
                Mobile mobile4 = MobileFactory.createMobile(Mobile.LG);
                Mobile mobile5 = MobileFactory.createMobile(Mobile.MOTOROLA);
                Mobile mobile6 = MobileFactory.createMobile(Mobile.SONY);
                System.out.println(mobile1.imprimir());
                System.out.println(mobile2.imprimir());
                System.out.println(mobile3.imprimir());
                System.out.println(mobile4.imprimir());
                System.out.println(mobile5.imprimir());
                System.out.println(mobile6.imprimir());
	}
}
