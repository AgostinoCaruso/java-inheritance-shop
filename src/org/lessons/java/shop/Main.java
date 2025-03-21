package org.lessons.java.shop;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Iva iva22 = new Iva(new BigDecimal("0.22"));
        //Smartphone
        Smartphone sp = new Smartphone("iphone", "apple", new BigDecimal("199.01"), iva22, "", 0);
        System.out.println(sp.GetCodiceNomeEsteso());

        //Televisore
        Televisori tv = new Televisori("tv Bello", "Samsung", new BigDecimal(2), iva22, 34.5f, false);
        System.out.println(tv.GetCodiceNomeEsteso());
        
        //Cuffie
        Cuffie airpod = new Cuffie("airPods", "apple", new BigDecimal(99), iva22,"bianco", true);
        System.out.println(airpod.GetCodiceNomeEsteso());
    }
}
