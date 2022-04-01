package by.tc.task01.specification;

public class Depth implements SetAttribute {
    private int depth;

    @Override
    public void setAttribute(String value) {
        this.depth = Integer.parseInt(value);
    }

    public int getDepth() {
        return depth;
    }
}
