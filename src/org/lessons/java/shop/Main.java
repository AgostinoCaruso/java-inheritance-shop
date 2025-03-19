package org.lessons.java.shop;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Smartphone
        Smartphone sp = new Smartphone("iphone", "apple", new BigDecimal("199.01"), new BigDecimal(0.20), "", 0);
        System.out.println(sp.GetCodiceNomeEsteso());

        //Televisore
        Televisori tv = new Televisori("tv Bello", "Samsung", new BigDecimal(2), new BigDecimal(0.22), 34.5f, false);
        System.out.println(tv.GetCodiceNomeEsteso());
        
        //Cuffie
        Cuffie airpod = new Cuffie("airPods", "apple", new BigDecimal(99), new BigDecimal(0.20),"bianco", true);
        System.out.println(airpod.GetCodiceNomeEsteso());
    }
}
