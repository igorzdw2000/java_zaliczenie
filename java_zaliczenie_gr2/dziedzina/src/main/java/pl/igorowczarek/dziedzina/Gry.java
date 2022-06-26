package pl.igorowczarek.dziedzina;

public class Gry extends Medium {
    private final String[] platformy = {"PC","PlayStation","Xbox"};
    private String platforma;

    public void setPlatforma(String platforma) {
        this.platforma = platforma;
    }

    public String[] getPlatformy() {
        return platformy;
    }

    public String getPlatforma() {
        return platforma;
    }

    public Gry(String tytul, int kwota, int index) {
        super(tytul, kwota);
        this.platforma = platformy[index];
    }
}
