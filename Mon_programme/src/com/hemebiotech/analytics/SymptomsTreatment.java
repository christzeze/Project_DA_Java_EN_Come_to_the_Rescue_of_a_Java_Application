package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SymptomsTreatment  {
    private List<String> result;
    private TreeMap<String, Integer> symptomList = new TreeMap<String, Integer>();
    private int counter = 0;
    private SymptomsFileManagment mySymptomFile;

    public SymptomsTreatment() {
        this.mySymptomFile=new SymptomsFileManagment("C:/Users/Personne/Desktop/openclassrooms/Projet1/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/","symptoms.txt");
    }

    public TreeMap Treatment() {

        // read file
        result = mySymptomFile.GetSymptoms();

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
        return symptomList;
    }
}
