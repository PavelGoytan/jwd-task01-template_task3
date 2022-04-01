package by.tc.task01.specification;

public class PowerConsumption implements SetAttribute {
    private int powerConsumption;

    @Override
    public void setAttribute(String value) {
        this.powerConsumption = Integer.parseInt(value);
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}
