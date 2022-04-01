package by.tc.task01.specification;

public class SystemMemory implements SetAttribute {
    private int systemMemory;

    @Override
    public void setAttribute(String value) {
        this.systemMemory = Integer.parseInt(value);
    }

    public int getSystemMemory() {
        return systemMemory;
    }
}
