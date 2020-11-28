package com.hemebiotech.analytics;

import com.hemebiotech.analytics.counter.ICounter;
import com.hemebiotech.analytics.counter.SymptomsFileDataCounter;
import com.hemebiotech.analytics.reader.IReader;
import com.hemebiotech.analytics.reader.SymptomDataFileReader;
import com.hemebiotech.analytics.writer.IWriter;
import com.hemebiotech.analytics.writer.SymptomsWriter;

import java.util.List;
import java.util.Map;

/**
 * @author christine zerrouk
 * @version 1.0
 */
public class AnalyticsCounter {
    public static void main(String[] args) {
        IReader reader = new SymptomDataFileReader();
        List<String> symptoms = reader.read("symptoms.txt");

        ICounter counter = new SymptomsFileDataCounter();
        Map<String, Long> counts = counter.count(symptoms);

        IWriter writer = new SymptomsWriter();
        writer.write(counts);
    }
}
