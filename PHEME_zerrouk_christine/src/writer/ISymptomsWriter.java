package writer;

import java.util.TreeMap;


/**
 * Définition du contrat sur la méthode qui écrit les données dans le fichier csv
 * Le paramètre définit le dictionnaire en entrée qui contient les symptômes comptés
 */

public interface ISymptomsWriter {

    void write(TreeMap symptomList);

}
