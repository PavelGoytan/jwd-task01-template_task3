package by.tc.task01.specification;

public class Cpu implements SetAttribute {
    private double cpu;

    @Override
    public void setAttribute(String value) {
        this.cpu = Double.parseDouble(value);
    }

    public double getCpu() {
        return cpu;
    }
}
