package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Son rôle est de lire les symptomes à partir du fichier "Symptoms.txt"
 */

public class SymptomsFileReader implements ISymptomsReader {
    private String fileName;
    private BufferedReader reader;

    public List<String> readSymptoms(String filepath) {
        List<String> result = new ArrayList<>();
        if (filepath != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
                // lit la première ligne du fichier
                String line = reader.readLine();

                while (line != null) {
                    // ajoute la ligne lue à la liste result
                    result.add(line);
                    // lit la ligne suivante du fichier
                    line = reader.readLine();
                }
            } catch (IOException e) {
                throw new ReaderException("Erreur lors de la lecture du fichier" + filepath, e);
            }
        }
        return result;
    }

}
