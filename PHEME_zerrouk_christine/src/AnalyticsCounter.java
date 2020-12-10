import counter.ISymptomsCounter;
import counter.SymptomsFileDataCounter;
import reader.ISymptomsReader;
import reader.SymptomsFileReader;
import writer.ISymptomsWriter;
import writer.SymptomsFileWriter;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
    public static void main(String[] Args) {
        ISymptomsReader reader = new SymptomsFileReader();
        List<String> symptoms = reader.readSymptoms("symptoms.txt");

        ISymptomsCounter counter = new SymptomsFileDataCounter();
        TreeMap<String, Integer> symptomList = counter.Treatment(symptoms);

        ISymptomsWriter writer = new SymptomsFileWriter();
        writer.write(symptomList);
    }
}
