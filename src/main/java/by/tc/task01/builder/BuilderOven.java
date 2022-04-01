package by.tc.task01.builder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.specification.*;

import java.util.HashMap;
import java.util.Map;

import static by.tc.task01.constant.Constant.*;

public class BuilderOven implements Builder {

    private final PowerConsumption powerConsumption = new PowerConsumption();
    private final Capacity capacity = new Capacity();
    private final Width width = new Width();
    private final Weight weight = new Weight();
    private final Height height = new Height();
    private final Depth depth = new Depth();
    private final Map<String, SetAttribute> mapAttribute = new HashMap<>();

    public BuilderOven() {
        mapAttribute.put(POWER_CONSUMPTION, powerConsumption);
        mapAttribute.put(CAPACITY, capacity);
        mapAttribute.put(WIDTH, width);
        mapAttribute.put(WEIGHT, weight);
        mapAttribute.put(DEPTH, depth);
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

    public Map<String, SetAttribute> getMapAttribute() {
        return mapAttribute;
    }

    @Override
    public Appliance getAppliance() {
        return new Oven(powerConsumption.getPowerConsumption(),
                weight.getWeight(),
                capacity.getCapacity(),
                depth.getDepth(),
                height.getHeight(),
                width.getWidth());
    }
}
