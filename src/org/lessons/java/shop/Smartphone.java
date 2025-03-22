package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private String codiceIMEI;
    private int memoria;

    public Smartphone() {
        super();
        System.out.println("Immetti il codice IMEI: ");
        this.codiceIMEI = scan.nextLine();
        
        System.out.println("Immetti quanta memoria ha lo smartphone: ");
        this.memoria = scan.nextInt();

        if(tesseraFedelta.getisTesseraFedelta() && memoria < 32)
            tesseraFedelta.setScontoTesseraFedelta(new BigDecimal("0.05"));
        else{
            tesseraFedelta.setScontoTesseraFedelta(new BigDecimal("0.02"));
        }
        this.sconto = tesseraFedelta.getScontoTesseraFedelta();

        System.out.println(PrezzoScontato(this.sconto));
    }

    public Smartphone(String nome, String marca, BigDecimal prezzo, Iva iva, String codiceIMEI, int memoria) {

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
        return String.format("Il prodotto è uno smartphone, codice: %s, il codice IMEI è: %s, la memoria è: %d, il prezzo è di %.2f$, lo sconto applicato è: %.2f.\n",
                super.GetCodiceNomeEsteso(),
                getCodiceIMEI(),
                getMemoria(),
                GetPrezzoConIva(),
                this.sconto);
    }
}
