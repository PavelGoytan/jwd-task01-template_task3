package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.factory.ApplianceCreator;
import by.tc.task01.parser.Parser;
import by.tc.task01.reader.ReadingRequiredAppliance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {
    private final Parser parser = new Parser();
    private final ReadingRequiredAppliance findAppliance = new ReadingRequiredAppliance();
    private final ApplianceCreator applianceCreator = new ApplianceCreator();

    @Override
    public List<Appliance> find(Criteria criteria, List<String> appliances) {
        List<String> applianceLine = findAppliance.requiredAppliance(criteria, appliances);
        List<Appliance> applianceList = new ArrayList<>();
        for (String applianceString : applianceLine) {
            Map<String, String> parameterMap = parser.convertField(applianceString);
            applianceList.add(applianceCreator.buildAppliance(parameterMap));
        }
        return applianceList;
    }
}