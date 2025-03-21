package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smartphone
  o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.

Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per 
restituire le informazioni da stampare per ogni classe)

Bonus:
Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con 
tessera fedeltà, che applica al prezzo uno sconto del 2%.
Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore a 32GB, 
altrimenti rimane del 2%.
Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%.
Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.
Nella classe carrello chiedere all’utente se possiede una carta fedeltà
In base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.
 */
public class Carrello {

    private Prodotto[] carrelloSpesa;
    protected Scanner scan = new Scanner(System.in);
    private int numeroProdotti;
    public Carrello() {
        
        CreaCarrello();
        //------------------------
        PopolaCarrelloConProdotti();
        //--------------------
        StampaSchermo();
        scan.close();
    }

    
    private void CreaCarrello() {
        System.out.println("Scrivi il numero di prodotti che vuoi mettere nel carrello: ");
        numeroProdotti = scan.nextInt();
        scan.nextLine();
        carrelloSpesa = new Prodotto[numeroProdotti];
    }
    
    private void PopolaCarrelloConProdotti() {
        
        for (int i = 0; i < numeroProdotti; i++) {
            System.out.println("Cosa vuoi aggiungere tra cuffie, smartphone o tv?");
            String prodottoScritto = scan.nextLine().trim().toLowerCase();
            
            switch (prodottoScritto) {
                case "cuffie":
                System.out.println("Hai scelto Cuffie!");
                carrelloSpesa[i] = new Cuffie();
                break;
                case "phone":
                System.out.println("Hai scelto Smartphone!");
                carrelloSpesa[i] = new Smartphone();
                break;
                case "tv":
                System.out.println("Hai scelto TV!");
                carrelloSpesa[i] = new Televisori();
                break;
                default:
                System.out.println("Hai inserito un nome non valido, riprovare (si) o uscire (no)?");
                String risposta = scan.nextLine().trim().toLowerCase();
                if (risposta.equals("si")) {
                    i--;
                } else {
                    return;
                }
            }
        }
    }
    
    private void StampaSchermo() {
        for (int i = 0; i < numeroProdotti; i++) {
            System.out.println(carrelloSpesa[i].GetCodiceNomeEsteso());
        }
    }
    
    public Prodotto[] getCarrello() {
        return carrelloSpesa;
    }
    public static void main(String[] args) {
        
        Carrello carrello = new Carrello();
    }
}
