package by.tc.task01.specification;

public class BagType implements SetAttribute {
    private String bagType;

    @Override
    public void setAttribute(String value) {
        this.bagType = value;
    }

    public String getBagType() {
        return bagType;
    }
}
