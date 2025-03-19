package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

    private float dimensioni;
    private boolean isSmart;

    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, float dimensioni, boolean isSmart) {

        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni > 0 ? dimensioni : 1;
        this.isSmart = isSmart;
    }

    // get&set
    public float getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(float dimensioni) {
        this.dimensioni = dimensioni;
    }
    public boolean getisSmart(){
        return isSmart;
    }
    public void setisSmart(boolean isSmart){
        this.isSmart = isSmart;
    }
    @Override
    public String GetCodiceNomeEsteso() {
        return String.format("%s, le dimensioni sono: %.2f pollici, è smart: %s.\n", 
            super.GetCodiceNomeEsteso(), 
            getDimensioni(),
            (getisSmart() ? "si" : "no")
        );
    }
}
