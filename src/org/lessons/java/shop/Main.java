package org.lessons.java.shop;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Smartphone
        Smartphone sp = new Smartphone("iphone", "apple", new BigDecimal("199.01"), new BigDecimal(0.20), "", 0);
        System.out.printf("%.2f$",sp.getPrezzo());
        System.out.printf("\nil codice IMEI è: %s, la memoria è: %d.", sp.codiceIMEI, sp.memoria);

        
    }
}
