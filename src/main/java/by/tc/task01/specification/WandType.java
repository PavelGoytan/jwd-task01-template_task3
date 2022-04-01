package by.tc.task01.specification;

public class WandType implements SetAttribute {
    private String wandType;

    @Override
    public void setAttribute(String value) {
        this.wandType = value;
    }

    public String getWandType() {
        return wandType;
    }
}
