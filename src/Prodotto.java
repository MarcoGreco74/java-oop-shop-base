/*
 Nel progetto java-oop-shop, creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
Nella stessa cartella src aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
*/

public class Prodotto {
    private boolean esaurito;
    private boolean inVendita;
    private String nome;
    private String descrizione;
    private double prezzo;
    
    public Prodotto(boolean esaurito, boolean inVendita) {
        this.esaurito = esaurito;
        this.inVendita = inVendita;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int generaCodice(){
        int codice = (int)(Math.random()*100);
        return codice;
    }

    public double getPrezzoBase(){
        return prezzo; 
    }

    public void setPrezzoBase(double prezzoBase){
        prezzo = prezzoBase;
    }

    public double getPrezzoIva(double prezzo){
        this.prezzo = prezzo;
        double prezzoConIva = prezzo + (prezzo / 100 * 20);
        return prezzoConIva;
    }

    public String getNomeEsteso(String nome, int codice){
        String nomeEsteso = this.nome+codice;
        return nomeEsteso;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
}
