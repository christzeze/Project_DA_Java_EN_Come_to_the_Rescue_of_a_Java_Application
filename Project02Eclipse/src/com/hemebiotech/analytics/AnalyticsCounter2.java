package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter2 {
    /**
     * @author christine zerrouk
     * @version 1.0
     */

    public static void main(String[] args) {
        List<String> result;
        TreeMap<String, Integer> symptomList = new TreeMap<String, Integer>();
        int counter = 0;

        // creates an instance of ReadSymptomDataFromFile
        ReadSymptomDataFromFile myreader = new ReadSymptomDataFromFile("C:/Users/Personne/Desktop/openclassrooms/Projet1/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");

        // create an instance of OpenSymptomDataToFile
        WriteSymptomToFile myFile = new WriteSymptomToFile("C:/Users/Personne/Desktop/openclassrooms/Projet1/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/results.out");

        // open the file in output
        FileWriter myWriter = myFile.OpenSymptomDataToFile();


        // read file
        result = myreader.GetSymptoms();

        // browse the list of symptoms
        for (String theResult : result) {

            // iterate through the list to find the symptoms equivalent to the one stored in the symptom variable
            for (String symptom2 : result) {
                if (symptom2.equals(theResult)) {
                    //increments the counter
                    counter += 1;
                }

            }
            // puts the symptom and the counter in a dictionary
            symptomList.put(theResult, counter);

            // reset counter
            counter = 0;
        }

        // iterate through the dictionnary to write symptoms and counter in the output file
        for (Map.Entry mapentry : symptomList.entrySet()) {
            // puts in variables the key and the value present in the dictionary
            String myKey = (String) mapentry.getKey();
            int myValue = (int) mapentry.getValue();

            //writes dictionary keys and values to the output file
            myFile.WriteSymptomData(myWriter, myKey, myValue);

            // prints on screen the key and the value
            System.out.println(mapentry.getKey() + " | " + mapentry.getValue());
        }


        // close the output file
        myFile.CloseSymptomDateFile(myWriter);


    }
}
