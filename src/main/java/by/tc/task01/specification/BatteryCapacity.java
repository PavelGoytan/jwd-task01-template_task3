package by.tc.task01.specification;

public class BatteryCapacity implements SetAttribute {
    private double batteryCapacity;

    @Override
    public void setAttribute(String value) {
        this.batteryCapacity = Double.parseDouble(value);
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
}
