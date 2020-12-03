package hemebiotech;

import hemebiotech.counter.SymptomsFileDataCounter;
import hemebiotech.reader.ISymptomReader;
import hemebiotech.reader.SymptomsFileReader;
import hemebiotech.writer.IsSymptomeWriter;
import hemebiotech.writer.SymptomsFileWriter;
import hemebiotech.counter.ISymptomsCounter;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
    public static void main(String[] Args) {
        ISymptomReader reader=new SymptomsFileReader();
        List<String> symptoms = reader.readSymptoms("symptoms.txt");

        ISymptomsCounter counter=new SymptomsFileDataCounter();
        TreeMap<String, Integer> symptomList = counter.Treatment(symptoms);

        IsSymptomeWriter writer=new SymptomsFileWriter();
        writer.write(symptomList);
    }
}
