package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean isWireless;

    public Cuffie() {
        super();

        System.out.println("Immetti il colore: ");
        String scanColore = scan.nextLine();
        colore = scanColore;

        System.out.println("Le cuffie sono wireless? : ");
        String scanisWireless = scan.nextLine().trim().toLowerCase();

        if (tesseraFedelta.getisTesseraFedelta() && scanisWireless.equals("si")){
            isWireless = true;
            tesseraFedelta.setScontoTesseraFedelta(new BigDecimal("0.07"));
        }
        else{
            isWireless = false;
            tesseraFedelta.setScontoTesseraFedelta(new BigDecimal("0.02"));
        }
        this.sconto = tesseraFedelta.getScontoTesseraFedelta();
    }

    public Cuffie(String nome, String marca, BigDecimal prezzo, Iva iva, String colore, boolean isWireless) {

        super(nome, marca, prezzo, iva);
        this.colore = colore == "" ? "non hai selezionato un colore" : colore;
        this.isWireless = isWireless;
    }

    // get&set
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getisWireless() {
        return isWireless;
    }

    public void setisWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String GetCodiceNomeEsteso() {
        return String.format("Il prodotto è una Cuffia, codice: %s, il colore è: %s, sono %s,il prezzo è di: %.2f$, lo sconto applicato è di %.2f.\n",
                super.GetCodiceNomeEsteso(),
                getColore(),
                (getisWireless() ? "wireless" : "con cavo"),
                GetPrezzoConIva(),
                sconto);
    }
}
