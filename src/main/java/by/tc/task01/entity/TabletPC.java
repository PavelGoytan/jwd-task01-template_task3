package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC implements Appliance {
    private double batteryCapacity;
    private int inchs;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(double batteryCapacity, int inchs, int memoryRom, int flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.inchs = inchs;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getInchs() {
        return inchs;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 && inchs == tabletPC.inchs && memoryRom == tabletPC.memoryRom && flashMemoryCapacity == tabletPC.flashMemoryCapacity && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, inchs, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInchs=" + inchs +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color +
                ']';
    }
}
