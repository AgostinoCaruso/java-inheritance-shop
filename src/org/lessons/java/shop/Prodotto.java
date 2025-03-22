package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Prodotto {
    Random r = new Random();
    protected Scanner scan = new Scanner(System.in);

    // campi
    protected int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected Iva ivaAmount;
    protected TesseraFedelta tesseraFedelta;
    protected BigDecimal sconto;

    // costruttore
    // costruttore overload senza parametri
    public Prodotto() {

        this.tesseraFedelta = TesseraFedelta.getInstance();

        this.codice = r.nextInt(0, 99999);

        System.out.println("Immetti il nome per il prodotto: ");
        String nome = scan.nextLine();
        this.nome = nome;

        System.out.println("Immetti la marca per il prodotto: ");
        String marca = scan.nextLine();
        this.marca = marca;

        System.out.println("Immetti il prezzo per il prodotto: ");
        BigDecimal prezzo = scan.nextBigDecimal();
        this.prezzo = prezzo;

        this.ivaAmount = new Iva();

        scan.nextLine();
    }

    public Prodotto(String nome, String marca, BigDecimal prezzo, Iva ivaAmount) {

        this.codice = r.nextInt(0, 99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.ivaAmount = ivaAmount;
    }

    // getter&setter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public Iva getIva() {
        return ivaAmount;
    }

    public void setIva(Iva ivaAmount) {
        this.ivaAmount = ivaAmount;
    }

    // metodi
    public BigDecimal GetPrezzo() {
        return prezzo.setScale(2, RoundingMode.DOWN);
    }

    public String toString() {

        BigDecimal prezzoFinale = PrezzoScontato(sconto);
        return String.format("Il nome del prodotto è %s, il prezzo finale è: %.2f$", nome, prezzoFinale);
    }

    public String toStringTesseraFedelta() {
        return String.format("%s, lo sconto applicato è di: %.2f, il prezzo è di %.2f",
                (tesseraFedelta.getisTesseraFedelta() ? "hai la tessera fedeltà" : "non hai la tessera fedeltà"),
                tesseraFedelta.getScontoTesseraFedelta(), PrezzoScontato(sconto));
    }

    public BigDecimal GetPrezzoConIva() {
        if (prezzo != null && ivaAmount != null) {
            return prezzo.add(prezzo.multiply(ivaAmount.getIvaAmount())).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public BigDecimal PrezzoScontato(BigDecimal scontoProdotto) {
        // applicare sconto 2% se tesseraFedelta == true
        BigDecimal prezzoConIva = GetPrezzoConIva();
        if (prezzoConIva != null && tesseraFedelta.getisTesseraFedelta()) {
            BigDecimal sconto = prezzoConIva
                    .multiply(scontoProdotto == null ? tesseraFedelta.getScontoTesseraFedelta() : scontoProdotto);
            return prezzoConIva.subtract(sconto).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String GetCodiceNomeEsteso() {
        return codice + "-" + nome;
    }
}
