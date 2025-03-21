package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;
public class Iva {
    Scanner scan = new Scanner(System.in);

    BigDecimal iva04 = new BigDecimal("0.04");
    BigDecimal iva10 = new BigDecimal("0.10");
    BigDecimal iva22 = new BigDecimal("0.22");

    private BigDecimal ivaAmount;
    public Iva(){
        System.out.println("Scegli l'aliquota del prodotto: ");
        int numeroIva = scan.nextInt();
        if(numeroIva == 4){
            ivaAmount = iva04;
        }
        else if( numeroIva == 10){
            ivaAmount = iva10;
        }else if(numeroIva == 22){
            ivaAmount = iva22;
        }
    }
    public Iva(BigDecimal iva){
        this.ivaAmount = iva;
    }

    public BigDecimal getIvaAmount(){
        return ivaAmount;
    }
    public void setIvaAmount(BigDecimal ivaAmount){
        this.ivaAmount = ivaAmount;
    }
}
