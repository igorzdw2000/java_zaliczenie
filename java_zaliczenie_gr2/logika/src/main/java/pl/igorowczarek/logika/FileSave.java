package pl.igorowczarek.logika;

import java.io.*;

public class FileSave implements IFileSave {
    @Override
    public String saveFile(String fileName, String textToWrite) {
        File file = new File(fileName);
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textToWrite);

        }catch (FileNotFoundException ex)
        {
            return "Nie znaleziono pliku "+ex.getMessage();

        }catch (IOException ex)
        {
            return "Błąd w operacji IO"+ex.getMessage();
        }finally {
            try {
                if(bufferedWriter!=null)
                {
                    bufferedWriter.close();
                }
            } catch (IOException ex)
            {
                return "Błąd w operacji IO"+ex.getMessage();
            }
        }
        return "Zapisano plik";
    }
}
