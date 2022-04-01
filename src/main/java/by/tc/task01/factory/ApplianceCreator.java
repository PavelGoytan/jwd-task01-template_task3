package by.tc.task01.factory;

import by.tc.task01.builder.*;

import by.tc.task01.constant.Constant;
import by.tc.task01.entity.Appliance;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCreator {
    public final String NAME = "name";
    private final Builder builderOven = new BuilderOven();
    private final Builder builderLaptop = new BuilderLaptop();
    private final Builder buildRefrigerator = new BuilderRefrigerator();
    private final Builder buildVacuumCleaner = new BuilderVacuumCleaner();
    private final Builder buildTabletPC = new BuilderTabletPC();
    private final Builder buildSpeakers = new BuilderSpeakers();
    private final Map<String, Builder> mapName = new HashMap<>();

    {
        mapName.put(Constant.OVEN, builderOven);
        mapName.put(Constant.LAPTOP, builderLaptop);
        mapName.put(Constant.REFRIGERATOR, buildRefrigerator);
        mapName.put(Constant.VACUUM_CLEANER, buildVacuumCleaner);
        mapName.put(Constant.TABLET_PC, buildTabletPC);
        mapName.put(Constant.SPEAKERS, buildSpeakers);
    }

    public Map<String, Builder> getMapName() {
        return mapName;
    }

    public Builder getBuilder(String s) {
        return mapName.get(s);
    }

    public Appliance createAppliance() {
        return builderOven.getAppliance();
    }

    public Appliance buildAppliance(Map<String, String> map) {
        if (mapName.containsKey(map.get(NAME))) {
            mapName.get(map.get(NAME)).setValue(map);
            return mapName.get(map.get(NAME)).getAppliance();
        }
        return null;
    }
}
