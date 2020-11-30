package com.hemebiotech.analytics.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Son Role c'est de persister les symptomes dans un fichier csv
 */
public class SymptomsWriter implements IWriter {
    @Override
    public void write(Map<String, Long> countedSymptoms) {
        try (FileWriter output = new FileWriter("out.csv")) {
            for (String symptom : countedSymptoms.keySet().stream().sorted().collect(Collectors.toList())) {
                output.write(symptom + "," + countedSymptoms.get(symptom) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
