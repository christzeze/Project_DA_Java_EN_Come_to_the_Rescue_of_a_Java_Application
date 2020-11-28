package com.hemebiotech.analytics.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * File reader
 */
public class SymptomDataFileReader implements IReader {

    @Override
    public List<String> read(String filepath) {
        List<String> result = new ArrayList<>();

        if (filepath != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
                String line = reader.readLine();
                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

}
