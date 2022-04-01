package by.tc.task01.converter;

import by.tc.task01.reader.ReaderFile;

import java.io.IOException;
import java.util.List;

public class ConverterAppliance {
    private final String filePath = String.valueOf(getClass().getClassLoader()
            .getResource("appliances_db.txt")).substring(6).replaceAll("/", "\\\\");
    private final ReaderFile readerFile = new ReaderFile();
    private final List<String> appliances = readerFile.applianceLines(filePath);

    public ConverterAppliance() throws IOException {
    }

    public List<String> getAppliance() {
        return appliances;
    }

}
