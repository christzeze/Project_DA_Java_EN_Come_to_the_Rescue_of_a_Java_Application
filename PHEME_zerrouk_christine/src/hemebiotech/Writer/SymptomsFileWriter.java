package hemebiotech.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Son rôle est d'écrire dans un fichier csv, le dictionnaire des symptômes comptés grâce à la classe SymptomsFileDateCounter
 */

public class SymptomsFileWriter implements IsSymptomeWriter {
    //private final String fileName;
    private String myKey;
    private int myValue;

    FileWriter writer;

    public FileWriter OpenResultFile(String filepath) {
        // ouvre le fichier de sortie
        FileWriter writer = null;
        if (filepath != null) {
            try {
                writer = new FileWriter(filepath);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return writer;
    }

    public void write(TreeMap symptomList) {
        FileWriter myWriter = OpenResultFile("results.out");
        // boucle sur le dictionnaire pour écrire les symptômes et le compteur des symptômes dans le fichier de sortie
        Iterator iterator = symptomList.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapentry = (Map.Entry) iterator.next();

            // récupère dans des variables la clé et la valeur associée du dictionnaire
            myKey = (String) mapentry.getKey();
            myValue = (Integer) mapentry.getValue();

            try {
                // écrit les deux variables récupérées dans le fichier de sortie
                myWriter.write(myKey + ", " + myValue);
                myWriter.write("\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // affiche à l'écran l'association clé, valeur associée à la clé
            System.out.println(myKey + " | " + myValue);
        }
        try {
            // ferme le fichier de sortie
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
