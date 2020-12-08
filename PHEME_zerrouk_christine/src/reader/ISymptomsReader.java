package reader;

import java.util.List;

/**
 * Définition du contrat sur la méthode qui lit les données dans le fichier symptoms
 * Le paramètre définit le chemin vers le fichier "symptoms.txt"
 */
public interface ISymptomsReader {
	/**
	 * 
	 * @return liste des symptômes lus
	 */
	List<String> readSymptoms(String filepapth);
}
