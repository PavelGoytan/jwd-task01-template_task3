package by.tc.task01.builder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.specification.*;

import java.util.HashMap;
import java.util.Map;

import static by.tc.task01.constant.Constant.*;

public class BuilderLaptop implements Builder {
    private BatteryCapacity batteryCapacity = new BatteryCapacity();
    private OperationSystem os = new OperationSystem();
    private MemoryRom memoryRom = new MemoryRom();
    private SystemMemory systemMemory = new SystemMemory();
    private Cpu cpu = new Cpu();
    private DisplayInchs displayInchs = new DisplayInchs();
    private Map<String, SetAttribute> mapAttribute = new HashMap<>();

    public BuilderLaptop() {
        mapAttribute.put(BATTERY_CAPACITY, batteryCapacity);
        mapAttribute.put(OS, os);
        mapAttribute.put(MEMORY_ROM, memoryRom);
        mapAttribute.put(SYSTEM_MEMORY, systemMemory);
        mapAttribute.put(CPU, cpu);
        mapAttribute.put(DISPLAY_INCHS, displayInchs);
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
        return new Laptop(batteryCapacity.getBatteryCapacity(),
                os.getOs(),
                memoryRom.getMemoryRom(),
                systemMemory.getSystemMemory(),
                cpu.getCpu(),
                displayInchs.getInchs());
    }
}
