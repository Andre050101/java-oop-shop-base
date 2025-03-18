package org.lessons.java.shop;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public BigDecimal getPrice(){
        return this.prezzo;
    }

    public BigDecimal getPriceWIva(){
        if(prezzo != null && iva != null){
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String getExtendedName(){
        if(nome != null){
            String extName = this.nome+"-"+this.codice;
            return extName;
        }
        return null;
        
    }

}
