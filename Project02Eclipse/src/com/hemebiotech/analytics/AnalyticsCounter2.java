package com.hemebiotech.analytics;

import java.util.TreeMap;


public class AnalyticsCounter2 {
    /**
     * @author christine zerrouk
     * @version 1.0
     */

    public static void main(String[] args) {

        TreeMap<String, Integer> symptomList = new TreeMap<String, Integer>();

        // create an instance of ResultFile
        ResultFileManagment myFile = new ResultFileManagment("C:/Users/Personne/Desktop/openclassrooms/Projet1/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/", "results.out");

        // create a instance of SymptomsTreatment
        SymptomsTreatment myTreatment = new SymptomsTreatment();

        // Treatment of datas
        symptomList = myTreatment.Treatment();

        // Write datas in output file
        myFile.WriteSymptomData(symptomList);

    }
}
