package by.tc.task01.specification;

public class DisplayInchs implements SetAttribute {
    private int inchs;

    @Override
    public void setAttribute(String value) {
        this.inchs = Integer.parseInt(value);
    }

    public int getInchs() {
        return inchs;
    }
}
