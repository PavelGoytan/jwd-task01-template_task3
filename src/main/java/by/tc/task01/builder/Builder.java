package by.tc.task01.builder;

import by.tc.task01.entity.Appliance;

import java.util.Map;

public interface Builder {
    void setValue(String s, String k);

    void setValue(Map<String, String> map);

    Appliance getAppliance();


}
