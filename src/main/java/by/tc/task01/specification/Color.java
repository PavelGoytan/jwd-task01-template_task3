package by.tc.task01.specification;

public class Color implements SetAttribute {
    private String color;

    @Override
    public void setAttribute(String value) {
        this.color = value;
    }

    public String getColor() {
        return color;
    }
}
