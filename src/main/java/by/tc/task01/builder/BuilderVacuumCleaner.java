package by.tc.task01.builder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.specification.*;

import java.util.HashMap;
import java.util.Map;

import static by.tc.task01.constant.Constant.*;

public class BuilderVacuumCleaner implements Builder {
    private final PowerConsumption powerConsumption = new PowerConsumption();
    private final FilterType filterType = new FilterType();
    private final BagType bagType = new BagType();
    private final WandType wandType = new WandType();
    private final MotorSpeedRegulation motorSpeed = new MotorSpeedRegulation();
    private final CleaningWidth cleaningWidth = new CleaningWidth();
    private final Map<String, SetAttribute> mapAttribute = new HashMap<>();

    public BuilderVacuumCleaner() {
        mapAttribute.put(POWER_CONSUMPTION, powerConsumption);
        mapAttribute.put(FILTER_TYPE, filterType);
        mapAttribute.put(BAG_TYPE, bagType);
        mapAttribute.put(WAND_TYPE, wandType);
        mapAttribute.put(MOTOR_SPEED, motorSpeed);
        mapAttribute.put(CLEANING_WIDTH, cleaningWidth);
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
        return new VacuumCleaner(powerConsumption.getPowerConsumption(),
                filterType.getFilterType(),
                bagType.getBagType(),
                wandType.getWandType(),
                motorSpeed.getMotorSpeed(),
                cleaningWidth.getCleaningWidth());
    }
}
