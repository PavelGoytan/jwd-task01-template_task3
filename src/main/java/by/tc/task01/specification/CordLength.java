package by.tc.task01.specification;

public class CordLength implements SetAttribute {
    private int cordLength;

    @Override
    public void setAttribute(String value) {
        this.cordLength = Integer.parseInt(value);
    }

    public int getCordLength() {
        return cordLength;
    }
}
