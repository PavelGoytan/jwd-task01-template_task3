package by.tc.task01.builder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.specification.*;

import java.util.HashMap;
import java.util.Map;

import static by.tc.task01.constant.Constant.*;

public class BuilderTabletPC implements Builder {
    private final BatteryCapacity batteryCapacity = new BatteryCapacity();
    private final DisplayInchs displayInchs = new DisplayInchs();
    private final MemoryRom memoryRom = new MemoryRom();
    private final FlashMemoryCapacity flashMemoryCapacity = new FlashMemoryCapacity();
    private final Color color = new Color();
    private final Map<String, SetAttribute> mapAttribute = new HashMap<>();

    public BuilderTabletPC() {
        mapAttribute.put(BATTERY_CAPACITY, batteryCapacity);
        mapAttribute.put(DISPLAY_INCHS, displayInchs);
        mapAttribute.put(MEMORY_ROM, memoryRom);
        mapAttribute.put(FLASH_MEMORY_CAPACITY, flashMemoryCapacity);
        mapAttribute.put(COLOR, color);
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
        return new TabletPC(batteryCapacity.getBatteryCapacity(),
                displayInchs.getInchs(),
                memoryRom.getMemoryRom(),
                flashMemoryCapacity.getFlashMemoryCapacity(),
                color.getColor());
    }
}
