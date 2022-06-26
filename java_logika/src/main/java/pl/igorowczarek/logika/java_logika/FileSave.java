/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.igorowczarek.logika.java_logika;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author igoro
 */
public class FileSave implements IFileSave {
    
    @Override
    public String writeFile(String fileName,String textToWrite)
    {
        File file = new File(fileName);
        BufferedWriter buffer = null;
        FileWriter writer;
        
        try
        {
            writer = new FileWriter(file);
            buffer = new BufferedWriter(writer);
            buffer.write(textToWrite);
            
        } catch(FileNotFoundException ex)
        {
            return "Nie znaleziono pliku o podanej nazwie "+ex.getMessage();
        }
        catch(IOException ex)
        {
            return "Wystąpił błąd w strumieni wejścia/wyjścia "+ex.getMessage();
        }
        finally{
            try
            {
                if(buffer != null)
            {
                buffer.close();
            }
            } catch(IOException ex)
            {
                return "Wystąpił błąd w strumieni wejścia/wyjścia "+ex.getMessage();
            }
            
        }
        
        return "Zapisano plik";
    }
    
}
