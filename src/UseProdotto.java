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
import java.util.Scanner;

public class UseProdotto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto");
        String nome = scan.next();
        
        System.out.println("Inserisci il prezzo base del prodotto");
        double prezzoBase = scan.nextDouble();
        
        System.out.println("Inserisci l'iva da applicare");
        double iva = scan.nextDouble();
        Prodotto prodotto = new Prodotto(nome, prezzoBase, iva);
        
        System.out.println("Descrivi brevemente il prodotto");
        String inizializeDescrizione = scan.next();
        prodotto.setDescrizione(inizializeDescrizione);
        String descrizione = prodotto.getDescrizione();
        
        int codice = prodotto.generaCodice(); 

        double prezzoConIva = prodotto.getPrezzoIva();

        String nomeEsteso = prodotto.getNomeEsteso(nome, codice);

        if(prodotto.getError(nome, prezzoBase, iva) == true){
            System.out.println("Il nome del prodotto è: "+nomeEsteso);
            System.out.println("Il codice del prodotto è: "+codice);
            System.out.println("Il prezzo base del prodotto è: "+prezzoBase);
            System.out.println("Il prezzo con iva del prodotto è: "+prezzoConIva);
            System.out.println("la sua descrizione: "+descrizione);
        }else{
            System.out.println("I dati inseriti non sono");
            //System.out.println(String.format("Il nome del prodotto è %s, il codice è %d, il prezzo base è %f, il prezzo con iva è %f ed è un %s", nomeEsteso, codice, prezzoBase, prezzoConIva, descrizione));
        }
    }
}
