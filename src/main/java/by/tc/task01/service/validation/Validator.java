package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.pattern.PatternReg;

import java.io.File;
import java.util.regex.Matcher;

public class Validator {
    private final StringBuilder stringBuilder = new StringBuilder();

    public boolean isValidFile(String filePath) {
        File file = new File(filePath);
        return file.exists() && file.isFile() && file.canRead();
    }

    public boolean isValidLine(String line) {
        boolean isAppliance;
        Matcher matcher = PatternReg.pattern.matcher(line.trim());
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
        }
        isAppliance = line.trim().length() == stringBuilder.length();
        stringBuilder.delete(0, stringBuilder.length());
        return isAppliance;
    }

    public static boolean criteriaValidator(Criteria criteria) {
        Class<?>[] enums = SearchCriteria.class.getClasses();
        for (Class<?> anEnum : enums) {
            if (anEnum.getSimpleName().equals(criteria.getGroupSearchName())) {
                return true;
            }
        }
        return false;
    }
}
