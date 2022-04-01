package by.tc.task01.specification;

public class CleaningWidth implements SetAttribute {
    private int cleaningWidth;

    @Override
    public void setAttribute(String value) {
        this.cleaningWidth = Integer.parseInt(value);
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }
}
