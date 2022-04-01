package by.tc.task01.reader;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.pattern.PatternReg;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;


public class ReadingRequiredAppliance {

    public List<String> requiredAppliance(Criteria criteria, List<String> listAppliance) {
        List<String> requiredParameter = criteria.parameterList();
        List<String> requiredApp = new ArrayList<>();
        for (String applianceString : listAppliance) {
            int count = 0;
            if (applianceString.startsWith(criteria.getGroupSearchName())) {
                for (String parameterString : requiredParameter) {
                    Matcher matcher = PatternReg.pattern2.matcher(applianceString);
                    while (matcher.find()) {
                        if (matcher.group().equals(parameterString)) {
                            count++;
                        }
                    }
                }
            }
            if (count == requiredParameter.size()) {
                requiredApp.add(applianceString);
            }
        }
        return requiredApp;
    }
}
