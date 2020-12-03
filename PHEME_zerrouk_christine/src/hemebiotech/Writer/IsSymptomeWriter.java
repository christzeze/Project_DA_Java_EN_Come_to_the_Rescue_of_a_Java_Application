package hemebiotech.Writer;

import java.io.FileWriter;
import java.util.TreeMap;


/**
 * Définition du contrat sur la méthode qui écrit les données dans le fichier csv
 * Le paramètre définit le dictionnaire en entrée qui contient les symptômes comptés
 */

public interface IsSymptomeWriter {

    /**
     * @param "symptomList" dictionnary récupéré dans la méthode main et généré par SymptomsFileDataCounter
     */

    FileWriter OpenResultFile(String filepath);

    void write(TreeMap symptomList);

}
