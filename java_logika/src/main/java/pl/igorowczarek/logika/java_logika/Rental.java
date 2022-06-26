/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.igorowczarek.logika.java_logika;
import java.util.ArrayList;
import java.util.List;
import pl.igorowczarek.dziedzina.java_dziedzina.Book;
import pl.igorowczarek.dziedzina.java_dziedzina.Game;
import pl.igorowczarek.dziedzina.java_dziedzina.Position;
import pl.igorowczarek.dziedzina.java_dziedzina.Client;
/**
 *
 * @author igoro
 */
public class Rental<T> implements IRental{
    
    String nazwa;
    int kwota;
    String rodzaje;
    int minWiek;
    int maxWiek;
    String pozycja;
    String imie;
    String nazwisko;
    int wiek;

    public String getNazwa() {
        return nazwa;
    }

    public int getKwota() {
        return kwota;
    }

    public String getRodzaje() {
        return rodzaje;
    }

    public int getMinWiek() {
        return minWiek;
    }

    public int getMaxWiek() {
        return maxWiek;
    }

    public String getPozycja() {
        return pozycja;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }
    
    
    public Rental(T obj, Client klient)
    {
        this.imie = klient.getImie();
        this.nazwisko = klient.getNazwisko();
        this.wiek = klient.getWiek();
        if(obj instanceof Book)
        {
            this.rodzaje = ((Book) obj).getRodzaj();
            if(klient.getWiek()<16 && !this.rodzaje.equals("dzieci"))
            {
                System.out.println("Książka niedostosowana do wieku");
                return;
            }
            else if(klient.getWiek()<19 && this.rodzaje.equals("dorośli"))
            {
                System.out.println("Książka niedostosowana do wieku");
                return;
            }
            else
            {
                this.nazwa = ((Book) obj).getNazwa();
                this.kwota = ((Book) obj).getKwota();
                this.pozycja = "book";
            }
        }
        if(obj instanceof Game)
        {
            this.minWiek = ((Game) obj).getMinWiek();
            this.maxWiek = ((Game) obj).getMaxWiek();
            if(((Game) obj).getMinWiek()>klient.getWiek())
            {
                System.out.println("Gra niedostosowana do wieku");
                return;
            }
            else if(((Game) obj).getMaxWiek() < klient.getWiek())
            {
                System.out.println("Gra niedostosowana do wieku");
                return;
            }
            else
            {
                this.nazwa = ((Game) obj).getNazwa();
                this.kwota = ((Game) obj).getKwota();
                this.pozycja = "game";
            }
        }
    }
    public Rental()
    {
        
    }
    @Override
    public String toString()
    {
        
            return ("Nazwa: "+this.nazwa+" | "+
                "Kwota: "+this.kwota+" | "+
                "Rodzaj: "+this.pozycja+" | "+
                "Nazwisko: "+this.nazwisko+" | "+
                "Wiek: "+this.wiek+" | ");
        
        
    }
    @Override
    public String showRentals(List<Rental> listRents)
    {
        int id = 1;
        String text = "";
        for(Rental r : listRents)
        {
            text += id+ " "+r+"\n";
            id++;
        }
        return text;
    }
    
    
    
}
