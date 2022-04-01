package by.tc.task01.builder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.specification.*;

import java.util.HashMap;
import java.util.Map;

import static by.tc.task01.constant.Constant.*;


public class BuilderRefrigerator implements Builder {
    private final PowerConsumption powerConsumption = new PowerConsumption();
    private final Width width = new Width();
    private final Weight weight = new Weight();
    private final Height height = new Height();
    private final FreezerCapacity freezerCapacity = new FreezerCapacity();
    private final OverallCapacity overallCapacity = new OverallCapacity();
    private final Map<String, SetAttribute> mapAttribute = new HashMap<>();

    public BuilderRefrigerator() {
        mapAttribute.put(POWER_CONSUMPTION, powerConsumption);
        mapAttribute.put(FREEZER_CAPACITY, freezerCapacity);
        mapAttribute.put(WIDTH, width);
        mapAttribute.put(WEIGHT, weight);
        mapAttribute.put(OVERALL_CAPACITY, overallCapacity);
        mapAttribute.put(HEIGHT, height);
    }

    @Override
    public void setValue(String s, String k) {
        if (mapAttribute.containsKey(s)) {
            mapAttribute.get(s).setAttribute(k);
        }
    }

    @Override
    public void setValue(Map<String, String> map) {
        for (Map.Entry<String, String> parameterEntry : map.entrySet()) {
            if (mapAttribute.containsKey(parameterEntry.getKey())) {
                mapAttribute.get(parameterEntry.getKey()).setAttribute(parameterEntry.getValue());
            }
        }
    }

    @Override
    public Appliance getAppliance() {
        return new Refrigerator(powerConsumption.getPowerConsumption(),
                weight.getWeight(),
                freezerCapacity.getFreezerCapacity(),
                overallCapacity.getOverallCapacity(),
                height.getHeight(),
                width.getWidth());
    }
}
