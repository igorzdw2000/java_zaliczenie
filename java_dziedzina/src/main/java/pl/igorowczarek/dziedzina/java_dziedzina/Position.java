/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.igorowczarek.dziedzina.java_dziedzina;

/**
 *
 * @author igoro
 */
public class Position {
    
    private String nazwa;
    private int kwota;
    private String wydawca;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }

    public int getKwota() {
        return kwota;
    }

    public String getWydawca() {
        return wydawca;
    }

    public Position(String nazwa, int kwota, String wydawca) {
        this.nazwa = nazwa;
        this.kwota = kwota;
        this.wydawca = wydawca;
    }
    
    
}
