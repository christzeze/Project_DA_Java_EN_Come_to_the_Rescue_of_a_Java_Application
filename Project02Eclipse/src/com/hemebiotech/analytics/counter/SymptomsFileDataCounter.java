package com.hemebiotech.analytics.counter;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsFileDataCounter implements ICounter {
    @Override
    public Map<String, Long> count(List<String> symptoms) {
        Map<String, Long> result = new TreeMap<>();
        for (String symptom : symptoms) {
            if (result.containsKey(symptom)) {
               result.put(symptom, result.get(symptom) + 1L);
            } else {
                result.put(symptom, 1L);
            }
        }
        return result;
    }
}
