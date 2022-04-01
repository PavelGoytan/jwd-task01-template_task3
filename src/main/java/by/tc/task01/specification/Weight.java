package by.tc.task01.specification;

public class Weight implements SetAttribute {
    private int weight;

    @Override
    public void setAttribute(String value) {
        this.weight = Integer.parseInt(value);
    }

    public int getWeight() {
        return weight;
    }
}
