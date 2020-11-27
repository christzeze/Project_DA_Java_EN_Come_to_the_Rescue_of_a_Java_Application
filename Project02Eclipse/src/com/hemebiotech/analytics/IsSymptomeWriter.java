package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.TreeMap;


/**
 * the methods that will write symptom data from a source
 * The important part is, the return value from the OpenSymptomDataToFile, which is FileWriter who is used by
 * others methods
 * Methods WriteSymptomData and CloseSymptomDateFile have parameters : the FileWriter give by the
 * OpenSymptomDataToFile method and also key and value give by the main programm
 */

public interface IsSymptomeWriter {

    /**
     * @param "symptomList" dictionnary give by the main programm
     * @return OpenResultFile return the FileWriter for the output file
     */

    FileWriter OpenResultFile();

    void WriteSymptomData(TreeMap symptomList);

}
