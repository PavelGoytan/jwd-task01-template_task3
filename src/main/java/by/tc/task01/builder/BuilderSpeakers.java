package by.tc.task01.builder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.specification.*;

import java.util.HashMap;
import java.util.Map;

import static by.tc.task01.constant.Constant.*;


public class BuilderSpeakers implements Builder {
    private final PowerConsumption powerConsumption = new PowerConsumption();
    private final NumberOfSpeakers numberOfSpeakers = new NumberOfSpeakers();
    private final FrequencyRange frequencyRange = new FrequencyRange();
    private final CordLength cordLength = new CordLength();
    private final Map<String, SetAttribute> mapAttribute = new HashMap<>();

    public BuilderSpeakers() {
        mapAttribute.put(POWER_CONSUMPTION, powerConsumption);
        mapAttribute.put(NUMBER_OF_SPEAKERS, numberOfSpeakers);
        mapAttribute.put(FREQUENCY_RANGE, frequencyRange);
        mapAttribute.put(CORD_LENGTH, cordLength);
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
        return new Speakers(powerConsumption.getPowerConsumption(),
                numberOfSpeakers.getNumberOfSpeakers(),
                frequencyRange.getFrequencyRange(),
                cordLength.getCordLength());
    }
}
