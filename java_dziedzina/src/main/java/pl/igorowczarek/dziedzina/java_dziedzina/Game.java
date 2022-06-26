/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.igorowczarek.dziedzina.java_dziedzina;

/**
 *
 * @author igoro
 */
public class Game extends Position{
    
    private int minWiek;
    private int maxWiek;
    
    public Game(String nazwa, int kwota, String wydawca,int minWiek,int maxWiek)
    {
        super(nazwa,kwota,wydawca);
        this.minWiek = minWiek;
        this.maxWiek = maxWiek;
    }

    public int getMinWiek() {
        return minWiek;
    }

    public int getMaxWiek() {
        return maxWiek;
    }

    public void setMinWiek(int minWiek) {
        this.minWiek = minWiek;
    }

    public void setMaxWiek(int maxWiek) {
        this.maxWiek = maxWiek;
    }
    
}
