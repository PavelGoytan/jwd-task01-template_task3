package by.tc.task01.specification;

public class Height implements SetAttribute {
    private double height;

    @Override
    public void setAttribute(String value) {
        this.height = Double.parseDouble(value);
    }

    public double getHeight() {
        return height;
    }
}
