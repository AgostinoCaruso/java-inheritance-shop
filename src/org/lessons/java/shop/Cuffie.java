package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean isWireless;

    public Cuffie(){
        super();

        System.out.println("Immetti il colore: ");
        String scanColore = scan.nextLine();
        colore = scanColore;

        System.out.println("Le cuffie sono wireless? : ");
        String scanisWireless = scan.nextLine().trim().toLowerCase();
        if(scanisWireless.equals("si"))
            isWireless=true;
        else
            isWireless=false;
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
        return String.format("%s, il colore è: %s, sono %s.\n", 
            super.GetCodiceNomeEsteso(), 
            getColore(),
            (getisWireless() ? "wireless" : "con cavo")
        );
    }
}
