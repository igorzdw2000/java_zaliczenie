package pl.igorowczarek.logika;
import pl.igorowczarek.dziedzina.*;

import java.util.List;

public class Wypozyczenie<T> implements IWypozyczenie{

    String tytul;
    int kwota;
    String format;
    String typ;
    String imie;
    String nazwisko;
    String rodzaj;
    int telefon;

    public Wypozyczenie(T obj,Klient klient)
    {
        this.imie = klient.getImie();
        this.nazwisko = klient.getNazwisko();
        this.telefon = klient.getTelefon();
        if(obj instanceof Filmy)
        {
            this.tytul = ((Filmy) obj).getTytul();
            this.kwota = ((Filmy) obj).getKwota();
            this.format = ((Filmy) obj).getFormat();
            this.rodzaj = "Film";

        }
        if(obj instanceof Gry)
        {
            this.tytul = ((Gry) obj).getTytul();
            this.kwota = ((Gry) obj).getKwota();
            this.typ = ((Gry) obj).getPlatforma();
            this.rodzaj = "Gra";
        }
    }
    public Wypozyczenie()
    {

    }
    @Override
    public String toString()
    {
        return ("Nazwa:  "+this.tytul+
                " | Typ:  "+this.rodzaj+
                " | Nazwisko: "+this.nazwisko+
                " | Telefon: "+this.telefon+
                " | Kwota: "+this.kwota);
    }

    public String getTytul() {
        return tytul;
    }

    public int getKwota() {
        return kwota;
    }

    public String getFormat() {
        return format;
    }

    public String getTyp() {
        return typ;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public int getTelefon() {
        return telefon;
    }

    @Override
    public String wyswietlWypozyczenia(List<Wypozyczenie> list) {
        int id = 1;
        String text = "";
        for(Wypozyczenie w : list)
        {
            text += id+" "+w+"\n";
            id++;
        }
        return text;
    }
}
