package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Son rôle est d'écrire dans un fichier csv, le dictionnaire des symptômes comptés grâce à la classe SymptomsFileDateCounter
 */

public class SymptomsFileWriter implements ISymptomsWriter {
    //private final String fileName;
    private String myKey;
    private int myValue;

    FileWriter writer;

    public void write(TreeMap symptomList) {
        try (FileWriter myWriter = new FileWriter("results.out")) {
            // boucle sur le dictionnaire pour écrire les symptômes et le compteur des symptômes dans le fichier de sortie
            Iterator iterator = symptomList.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry mapentry = (Map.Entry) iterator.next();

                // récupère dans des variables la clé et la valeur associée du dictionnaire
                myKey = (String) mapentry.getKey();
                myValue = (Integer) mapentry.getValue();
                // écrit les deux variables récupérées dans le fichier de sortie
                myWriter.write(myKey + ", " + myValue);
                myWriter.write("\r\n");

                // affiche à l'écran l'association clé, valeur associée à la clé
                System.out.println(myKey + " | " + myValue);
            }
        } catch (IOException e) {
            throw new WriterException("Erreur lors de l'écriture du fichier results.out", e);
        }
    }

}
