package by.tc.task01.reader;

import by.tc.task01.service.validation.Validator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderFile {

    public List<String> applianceLines(String filepath) throws IOException {
        List<String> fileLines = new ArrayList<>();
        Validator validator = new Validator();
        if (!validator.isValidFile(filepath)) {
            System.out.println("file not exists ");
            return fileLines;
        } else {
            Path path = Path.of(filepath);
            try (Scanner scanner = new Scanner(path)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (!line.isEmpty() && validator.isValidLine(line)) {
                        fileLines.add(line);
                    }
                }
            }
            return fileLines;
        }
    }
}
