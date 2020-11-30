package hemebiotech;

import hemebiotech.Counter.ISymptomsCounter;
import hemebiotech.Counter.SymptomsFileDataCounter;
import hemebiotech.Reader.ISymptomReader;
import hemebiotech.Reader.SymptomsFileReader;
import hemebiotech.Writer.IsSymptomeWriter;
import hemebiotech.Writer.SymptomsFileWriter;

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
