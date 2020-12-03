package hemebiotech.counter;

import java.util.List;
import java.util.TreeMap;

/**
 * Son rôle est de compter les symptomes et de les mettre dans un dictionnaire
 */

public class SymptomsFileDataCounter implements ISymptomsCounter  {

    public TreeMap<String, Integer> Treatment(List<String> symptoms)  {

        TreeMap<String, Integer> result = new TreeMap<>();

        // parcours la liste des symptômes
        for (String symptom  : symptoms) {

            // Si le symptôme est dans la liste "return", on incrémente la valeur de 1 sinon on initialise la valeur à 1
                if (result.containsKey(symptom)) {
                    result.put(symptom, result.get(symptom) + 1);
                } else {
                    result.put(symptom, 1);
                }
        }
        return result;
    }
}
