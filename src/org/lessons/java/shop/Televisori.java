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
        if(tesseraFedelta.getisTesseraFedelta() &&  scanisSmart.equals("si")){
            isSmart=true;
            tesseraFedelta.setScontoTesseraFedelta(new BigDecimal("0.02"));
        }
        else{
            isSmart=false;
            tesseraFedelta.setScontoTesseraFedelta(new BigDecimal("0.10"));
        }
        this.sconto = tesseraFedelta.getScontoTesseraFedelta();
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
        return String.format("Il prodotto è una TV, codice: %s, le dimensioni sono: %.0f pollici, è smart: %s,il prezzo è di: %.2f$, lo sconto applicato è di %.2f.\n", 
            super.GetCodiceNomeEsteso(), 
            getDimensioni(),
            (getisSmart() ? "si" : "no"),
            GetPrezzoConIva(),
            this.sconto
        );
    }
}
