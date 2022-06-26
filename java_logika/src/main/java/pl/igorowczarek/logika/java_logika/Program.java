/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.igorowczarek.logika.java_logika;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import pl.igorowczarek.dziedzina.java_dziedzina.Book;
import pl.igorowczarek.dziedzina.java_dziedzina.Client;
import pl.igorowczarek.dziedzina.java_dziedzina.Game;

/**
 *
 * @author igoro
 */
public class Program {
    
    public static void main(String[] args)
    {
        Client klient = new Client("Igor","Owczarek",22);
        List<Book> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(new Book("Pan Tadeusz","PJN",22,"Adam Mickiewicz",1));
        listaKsiazek.add(new Book("Krzyżacy","SWW",140,"Henryk Sienkiewicz",0));
        listaKsiazek.add(new Book("Zemsta","PJJ",100,"Aleksander Fredro",2));
        
        List<Game> listaGier = new ArrayList<>();
        listaGier.add(new Game("Yenga",50,"WWW",3,80));
        listaGier.add(new Game("EuroBiznes",120,"WwW",12,80));
        listaGier.add(new Game("Crudo",90,"WwwWW",3,60));
        
        List<Rental> listaWypozyczen = new ArrayList<>();
        listaWypozyczen.add(new Rental<Book>(listaKsiazek.get(0),klient));
        listaWypozyczen.add(new Rental<Book>(listaKsiazek.get(1),klient));
        listaWypozyczen.add(new Rental<Book>(listaKsiazek.get(2),klient));
        
        listaWypozyczen.add(new Rental<Game>(listaGier.get(0),klient));
        listaWypozyczen.add(new Rental<Game>(listaGier.get(1),klient));
        listaWypozyczen.add(new Rental<Game>(listaGier.get(2),klient));
        
         
      
        Rental manageRental = new Rental();
        String text = manageRental.showRentals(listaWypozyczen);
        System.out.println(text);
        
        Integer sum = listaWypozyczen.stream().mapToInt(x->x.getKwota()).sum();
       System.out.println("Suma wszystkich wypozyczen: "+sum);
        
        int rozmiar = listaWypozyczen.size();
        Comparator<Rental> comparator = Comparator.comparing(Rental::getKwota);
        System.out.println("Najdroższe wypożyczenie: ");
        listaWypozyczen.stream().max(comparator).ifPresent(ix->System.out.println(ix));
        
        FileSave file = new FileSave();
        file.writeFile("C:\\Users\\igoro\\OneDrive\\Dokumenty\\NetBeansProjects\\java_logika\\src\\main\\java\\pl\\igorowczarek\\logika\\java_logika\\tekst.txt", text);
        
        
        
    }
    
    
}
