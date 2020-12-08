package counter;

import java.util.List;
import java.util.TreeMap;

/**
 * Définition du contrat sur la méthode qui compte les données lues dans le fichier symptoms
 * Le paramètre définit la référence à la liste générée par la classe SymptomFileReader
 */

public interface ISymptomsCounter {
    /**
     *
     * @return un dictionnaire trié avec les symptomes et le nombre de fois où ces derniers apparaissent
     */
    public TreeMap Treatment(List<String> symptoms);
}
