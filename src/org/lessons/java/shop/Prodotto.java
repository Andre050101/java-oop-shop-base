package org.lessons.java.shop;
import java.lang.Math;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public int iva;

    public Prodotto(String nome, String descrizione, float prezzo, int iva){
        int codice = (int) (Math.random() * 100) + 1;
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public float getPrice(){
        return this.prezzo;
    }

    public float getPriceWIva(){
        return this.prezzo * (1 + this.iva / 100.0f);
    }

    public String getExtendedName(){
        String extName = this.nome+"-"+this.codice;
        return extName;
    }

}
