package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private String codiceIMEI;
    private int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceIMEI, int memoria) {

        super(nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI == "" || codiceIMEI == null
                ? "AAAAAA BB CCCCCC D"
                : codiceIMEI;
        this.memoria = memoria > 0 ? memoria : 1;
    }

    // get&setter
    public String getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(String codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String GetCodiceNomeEsteso() {
        return String.format("%s, il codice IMEI è: %s, la memoria è: %d.\n", 
            super.GetCodiceNomeEsteso(), 
            getCodiceIMEI(), 
            getMemoria()
        );
    }
}
