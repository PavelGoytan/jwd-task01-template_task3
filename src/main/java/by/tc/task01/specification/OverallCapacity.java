package by.tc.task01.specification;

public class OverallCapacity implements SetAttribute {
    private int overallCapacity;

    @Override
    public void setAttribute(String value) {
        this.overallCapacity = Integer.parseInt(value);
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }
}
