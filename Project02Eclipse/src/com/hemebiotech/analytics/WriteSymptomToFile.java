package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

/**
 * implementation
 */

public class WriteSymptomToFile implements IsSymptomeWriter {
    private final String filepath;


    /**
     * @param filepath a full or partial path to the results output file
     * @author christine zerrouk
     * @version 1.0
     */

    // constructor
    public WriteSymptomToFile(String filepath) {
        this.filepath = filepath;

    }

    public FileWriter OpenSymptomDataToFile() {
        FileWriter writer = null;
        if (filepath != null) {
            try {
                writer = new FileWriter(filepath);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return writer;
    }

    public void WriteSymptomData(FileWriter writer, String key, int value) {
        try {
            writer.write(key + ", " + value);
            writer.write("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void CloseSymptomDateFile(FileWriter writer) {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
