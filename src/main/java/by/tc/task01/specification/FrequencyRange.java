package by.tc.task01.specification;

public class FrequencyRange implements SetAttribute {
    private String frequencyRange;

    @Override
    public void setAttribute(String value) {
        this.frequencyRange = value;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }
}
