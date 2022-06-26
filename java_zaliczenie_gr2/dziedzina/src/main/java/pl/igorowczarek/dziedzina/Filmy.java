package pl.igorowczarek.dziedzina;

public class Filmy extends Medium{
    private final String[] formaty = {"DVD","bluRay"};
    private String format;

    public void setFormat(String format) {
        this.format = format;
    }

    public String[] getFormaty() {
        return formaty;
    }

    public String getFormat() {
        return format;
    }

    public Filmy(String tytul, int kwota, int index) {
        super(tytul, kwota);
        this.format = formaty[index];
    }
}
