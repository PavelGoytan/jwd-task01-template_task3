package by.tc.task01.specification;

public class FreezerCapacity implements SetAttribute {
    private int freezerCapacity;

    @Override
    public void setAttribute(String value) {
        this.freezerCapacity = Integer.parseInt(value);
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }
}
