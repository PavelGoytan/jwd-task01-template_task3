package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner implements Appliance {
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeed;
    private int cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeed, int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeed = motorSpeed;
        this.cleaningWidth = cleaningWidth;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public int getMotorSpeed() {
        return motorSpeed;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption && motorSpeed == that.motorSpeed && cleaningWidth == that.cleaningWidth && Objects.equals(filterType, that.filterType) && Objects.equals(bagType, that.bagType) && Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeed, cleaningWidth);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" +
                "powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType=" + bagType +
                ", wandType=" + wandType +
                ", motorSpeed=" + motorSpeed +
                ", cleaningWidth=" + cleaningWidth +
                ']';
    }
}
