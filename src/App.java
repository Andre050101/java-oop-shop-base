import org.lessons.java.shop.Prodotto;
public class App {
    public static void main(String[] args) throws Exception {
        Prodotto Giocattolo = new Prodotto("Peluche", "Peluche morbidoso", 11.69f, 12);
        System.out.println("Il prezzo senza iva è "+Giocattolo.getPrice());
        System.out.println("Il prezzo con iva è "+Giocattolo.getPriceWIva());
        System.out.println("Il nome esteso con nome e codice è "+Giocattolo.getExtendedName());
    }
}
