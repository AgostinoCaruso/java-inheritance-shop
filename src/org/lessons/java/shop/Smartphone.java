package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{

    String codiceIMEI;
    int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceIMEI, int memoria ){
        super(nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI == "" || codiceIMEI == null 
                        ? "AAAAAA BB CCCCCC D" : codiceIMEI;
        this.memoria = memoria > 0 ? memoria : -1;
    }
    //get&setter
    public String getCodiceIMEI(){
        return codiceIMEI;
    }
    public void setCodiceIMEI(String codiceIMEI){
        this.codiceIMEI = codiceIMEI;
    }
    public int getMemoria(){
        return memoria;
    }
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
}
