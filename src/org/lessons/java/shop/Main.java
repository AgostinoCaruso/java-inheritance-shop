package org.lessons.java.shop;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Smartphone
        Smartphone sp = new Smartphone("iphone", "apple", new BigDecimal("199.01"), new BigDecimal(0.20), "", 0);
        System.out.println(sp.GetCodiceNomeEsteso());
        System.out.printf("il codice IMEI è: %s, la memoria è: %d.\n\n", sp.getCodiceIMEI(), sp.getMemoria());

        //Televisore
        Televisori tv = new Televisori("tv Bello", "Samsung", new BigDecimal(2), new BigDecimal(0.22), 34.5f, false);
        System.out.println(tv.GetCodiceNomeEsteso());
        System.out.printf("Le dimensioni sono: %.2f pollici, è smart? %s.\n\n", tv.getDimensioni(),
        (tv.getisSmart() ? "si" : "no"));
        
        //Cuffie
        Cuffie airpod = new Cuffie("airPods", "apple", new BigDecimal(99), new BigDecimal(0.20),"bianco", true);
        System.out.println(airpod.GetCodiceNomeEsteso());
        System.out.printf("il colore è: %s, sono %s.\n\n", airpod.getColore(), (airpod.getisWireless() ? "wireless" : "con cavo"));
    }
}
