package by.tc.task01.specification;

public class Capacity implements SetAttribute {
    private int capacity;

    @Override
    public void setAttribute(String value) {
        this.capacity = Integer.parseInt(value);
    }

    public int getCapacity() {
        return capacity;
    }
}
