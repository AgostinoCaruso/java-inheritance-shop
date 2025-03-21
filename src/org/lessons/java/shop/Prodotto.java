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
    public static boolean tesseraFedelta;
    // costruttore
    // costruttore overload senza parametri
    public Prodotto() {

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

    public void setPrezzo(double prezzo) {
        this.prezzo = BigDecimal.valueOf(prezzo);
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

    public BigDecimal GetPrezzoConIva() {
        if (prezzo != null && ivaAmount != null) {
            return prezzo.add(prezzo.multiply(ivaAmount.getIvaAmount())).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String GetCodiceNomeEsteso() {
        return codice + "-" + nome;
    }
}
