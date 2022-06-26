package pl.igorowczarek.dziedzina;

public abstract class Medium {
    String tytul;
    int kwota;

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    public String getTytul() {
        return tytul;
    }

    public int getKwota() {
        return kwota;
    }

    public Medium(String tytul, int kwota) {
        this.tytul = tytul;
        this.kwota = kwota;
    }
}
