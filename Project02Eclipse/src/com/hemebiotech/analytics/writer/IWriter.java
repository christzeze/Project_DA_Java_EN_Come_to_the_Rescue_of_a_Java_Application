package com.hemebiotech.analytics.writer;

import java.util.Map;

/**
 * Son role c'est de persister les symptoms dans une sortie
 */
public interface IWriter {
    void write(Map<String, Long> countedSymptoms);
}
