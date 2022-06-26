package pl.igorowczarek.logika;

import pl.igorowczarek.dziedzina.Filmy;
import pl.igorowczarek.dziedzina.Gry;
import pl.igorowczarek.dziedzina.Klient;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {



    public static void main(String[] args) {
        Klient klient = new Klient("Igor","Owczarek",123456789);
        Wypozyczenie wypozyczenieManage = new Wypozyczenie<>();
        List<Filmy> listaFilmy = new ArrayList<>();
        List<Gry> listaGry = new ArrayList<>();
        List<Wypozyczenie> wypozyczenieList = new ArrayList<>();

        listaFilmy.add(new Filmy("Top Gear",145,0));
        listaFilmy.add(new Filmy("Ogniem i mieczem",100,0));
        listaFilmy.add(new Filmy("Diuna",200,1));
        listaFilmy.add(new Filmy("Dunkierka",100,1));

        listaGry.add(new Gry("Need for speed",100,0));
        listaGry.add(new Gry("FIFA 22",150,0));
        listaGry.add(new Gry("Mafia II",90,1));
        listaGry.add(new Gry("TEST",10,2));

        wypozyczenieList.add(new Wypozyczenie<Filmy>(listaFilmy.get(0),klient));
        wypozyczenieList.add(new Wypozyczenie<Filmy>(listaFilmy.get(1),klient));
        wypozyczenieList.add(new Wypozyczenie<Filmy>(listaFilmy.get(2),klient));
        wypozyczenieList.add(new Wypozyczenie<Filmy>(listaFilmy.get(3),klient));

        wypozyczenieList.add(new Wypozyczenie<Gry>(listaGry.get(0),klient));
        wypozyczenieList.add(new Wypozyczenie<Gry>(listaGry.get(1),klient));
        wypozyczenieList.add(new Wypozyczenie<Gry>(listaGry.get(2),klient));
        wypozyczenieList.add(new Wypozyczenie<Gry>(listaGry.get(3),klient));

        System.out.println(wypozyczenieManage.wyswietlWypozyczenia(wypozyczenieList));
        FileSave fileSave = new FileSave();
        System.out.println(fileSave.saveFile("C:\\Users\\igoro\\IdeaProjects\\java_zaliczenie_gr2\\logika\\src\\main\\java\\pl\\igorowczarek\\logika\\tekst.txt",wypozyczenieManage.wyswietlWypozyczenia(wypozyczenieList)));

        Comparator<Wypozyczenie> comparator = Comparator.comparing(Wypozyczenie::getKwota);
        System.out.println("Najdroższe wypozyczenie:");
        wypozyczenieList.stream().max(comparator).ifPresent(ix->System.out.println(ix));

    }
}
