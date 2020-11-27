package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author christine zerrouk
 * @version 1.0
 */

public class SymptomsFileManagment extends FileManagment implements ISymptomReader {
    private String fileName;
    private BufferedReader reader;


    public SymptomsFileManagment(String path, String fileName) {
        super(path);
        this.fileName = path + fileName;

    }

    public List<String> GetSymptoms() {
        ArrayList<String> result = new ArrayList<String>();
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line = reader.readLine();

                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
