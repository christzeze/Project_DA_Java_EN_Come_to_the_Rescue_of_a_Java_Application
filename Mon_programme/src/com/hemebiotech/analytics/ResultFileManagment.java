package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ResultFileManagment extends FileManagment implements IsSymptomeWriter {
    private final String fileName;
    String myKey;
    int myValue;

    FileWriter writer;

    /**
     * @param fileName a full or partial path to the results output file
     * @author christine zerrouk
     * @version 1.0
     */

    // constructor
    public ResultFileManagment(String path, String fileName) {
        super(path);
        this.fileName = path + fileName;

    }

    public FileWriter OpenResultFile() {
        FileWriter writer = null;
        if (fileName != null) {
            try {
                writer = new FileWriter(fileName);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return writer;
    }

    public void WriteSymptomData(TreeMap symptomList) {
        FileWriter myWriter = OpenResultFile();
        // iterate through the dictionnary to write symptoms and counter in the output file
        Iterator iterator = symptomList.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapentry = (Map.Entry) iterator.next();


            // puts in variables the key and the value present in the dictionary
            myKey = (String) mapentry.getKey();
            myValue = (int) mapentry.getValue();

            try {
                myWriter.write(myKey + ", " + myValue);
                myWriter.write("\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // prints on screen the key and the value
            System.out.println(myKey + " | " + myValue);
        }
        try {
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
