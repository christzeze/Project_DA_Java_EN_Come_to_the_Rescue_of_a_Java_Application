package com.hemebiotech.analytics;

import java.io.FileWriter;


/**
 * the methods that will write symptom data from a source
 * The important part is, the return value from the OpenSymptomDataToFile, which is FileWriter who is used by
 * others methods
 * Methods WriteSymptomData and CloseSymptomDateFile have parameters : the FileWriter give by the
 * OpenSymptomDataToFile method and also key and value give by the main programm
 */

public interface IsSymptomeWriter {

    /**
     * @param "writer" FileWriter give by OpenSymptomDataToFile
     * @param "key"    key of dictionnary give by the main programm
     * @param "value"  value of dictionnary give by the main programm
     * @return OpenSymptomDataToFile return the FileWriter for the output file
     */

    FileWriter OpenSymptomDataToFile();

    void WriteSymptomData(FileWriter writer, String key, int value);

    void CloseSymptomDateFile(FileWriter writer);

}
