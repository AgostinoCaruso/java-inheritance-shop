package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

    private float dimensioni;
    private boolean isSmart;

    public Televisori(){
        super();

        System.out.println("Immetti le dimensioni: ");
        float scanDimensioni = scan.nextFloat();
        scan.nextLine();
        dimensioni = scanDimensioni;

        System.out.println("Il tv è smart? : ");
        String scanisSmart = scan.nextLine().trim().toLowerCase();
        if(scanisSmart.equals("si"))
            isSmart=true;
        else
            isSmart=false;
    }

    public Televisori(String nome, String marca, BigDecimal prezzo, Iva iva, float dimensioni, boolean isSmart) {

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
