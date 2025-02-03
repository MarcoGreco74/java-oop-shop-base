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
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;
    private String error;
    
    public Prodotto(String nome, double prezzo, double iva) {
        /*if(nome != null){
            this.nome = nome;
        }
        if(prezzo > 0){
            this.prezzo = prezzo;
        }else{
            System.out.println("Inserire un prezzo valido maggiore di zero");
        }
        if(iva == 4 || iva == 10 || iva == 22){
            this.iva = iva;
        }else{
            System.out.println("Iva non valida");
        }*/
        generaCodice();
        getError(nome, prezzo, iva);
    }

    public int generaCodice(){
        int codice = (int)(Math.random()*1000);
        return codice;
    }

    public double getPrezzoIva(){     
        double prezzoConIva = this.prezzo + (this.prezzo / 100 * this.iva);
        return prezzoConIva;
    }

    public String getNomeEsteso(String nome, int codice){
        String nomeEsteso = codice+"-"+this.nome;
        return nomeEsteso;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    public boolean getError(String nome, double prezzo, double iva){
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
        if(nome != null && prezzo > 0 && (iva == 4 || iva == 10 || iva == 22)){
            this.nome = nome;
            this.prezzo = prezzo;
            this.iva = iva;
            return true;
        }else{
            System.out.println("Dati non corretti");
            return false;
        }
    }

}
