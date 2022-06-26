/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.igorowczarek.dziedzina.java_dziedzina;

/**
 *
 * @author igoro
 */
public class Book extends Position {
    
    private String autor;
    private final String[] rodzaje = {"dzieci","młodzież","dorośli"};

    public String getRodzaj() {
        return rodzaj;
    }
    private String rodzaj;
    public Book(String nazwa, String wydawca, int kwota, String autor, int index)
    {
        super(nazwa,kwota,wydawca);
        this.autor = autor;
        this.rodzaj = rodzaje[index];
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String[] getRodzaje() {
        return rodzaje;
    }
}
