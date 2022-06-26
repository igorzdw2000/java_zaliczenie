package pl.igorowczarek.dziedzina;

public class Klient {
    String imie;
    String nazwisko;
    int telefon;

    public Klient(String imie, String nazwisko, int telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getImie() {
        return imie;
    }
}
