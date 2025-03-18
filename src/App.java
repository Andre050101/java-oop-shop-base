import java.math.BigDecimal;

import org.lessons.java.shop.Prodotto;
public class App {
    public static void main(String[] args) throws Exception {
        Prodotto Giocattolo = new Prodotto("Peluche", "Ciao morbidoso", new BigDecimal(10), new BigDecimal(12));
        System.out.println("Il prezzo senza iva è "+Giocattolo.getPrezzo());
        System.out.println("Il prezzo con iva è "+Giocattolo.getPriceWIva());
        System.out.println("Il nome esteso con nome e codice è "+Giocattolo.getExtendedName());
        System.out.println("Dati: codice: "+Giocattolo.getCodice()+", nome: "+Giocattolo.getNome()+", descrizione: "+Giocattolo.getDescrizione()+", prezzo: "+Giocattolo.getPrezzo()+", iva: "+Giocattolo.getIva());
    }
}
