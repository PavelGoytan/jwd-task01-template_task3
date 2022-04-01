package by.tc.task01.parser;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static final String REGEX_1 = "[a-zA-Z]+\\s:";
    public static final String REGEX_2 = "[,;]";
    public static final String REGEX_3 = "\\s+";
    public static final String REGEX_4 = "=";

    public Map<String, String> convertField(String line) {
        Map<String, String> mapParameter = new HashMap<>();
        String[] name = line.split(" :");
        mapParameter.put("name", name[0]);
        String[] parameterValue = line.replaceAll(REGEX_1, " ")
                .replaceAll(REGEX_2, " ")
                .replaceAll(REGEX_3, " ").trim().split(" ");
        for (String parameterValueString : parameterValue) {
            String[] split = parameterValueString.split(REGEX_4);
            mapParameter.put(split[0], split[1]);
        }
        return mapParameter;
    }
}
