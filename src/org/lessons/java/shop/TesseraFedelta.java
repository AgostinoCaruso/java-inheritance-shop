package org.lessons.java.shop;

import java.util.Scanner;
import java.math.BigDecimal;
public class TesseraFedelta {

    private static TesseraFedelta instance;
    private boolean tesseraFedelta;
    private BigDecimal scontoTesseraFedelta;
    
    public TesseraFedelta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hai la tessera fedeltà?: si o no");
        String risposta = scan.nextLine();
        setisTesseraFedelta(this.tesseraFedelta = risposta.equals("si") ? true : false);
    }

    public static TesseraFedelta getInstance() {
        if (instance == null) {
            instance = new TesseraFedelta();
        }
        return instance;
    }

    public boolean getisTesseraFedelta() {
        return tesseraFedelta;
    }

    public void setisTesseraFedelta(boolean tesseraFedelta) {
        this.tesseraFedelta = tesseraFedelta;
        this.scontoTesseraFedelta = tesseraFedelta ? new BigDecimal("0.02") : new BigDecimal("0");
    }

    public BigDecimal getScontoTesseraFedelta() {
        return scontoTesseraFedelta;
    }

    public void setScontoTesseraFedelta(BigDecimal sconto){
        this.scontoTesseraFedelta = sconto;
    }
}
