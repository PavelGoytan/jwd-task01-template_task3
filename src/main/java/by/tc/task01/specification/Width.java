package by.tc.task01.specification;

public class Width implements SetAttribute {
    private double width;

    @Override
    public void setAttribute(String value) {
        this.width = Double.parseDouble(value);
    }

    public double getWidth() {
        return width;
    }
}
