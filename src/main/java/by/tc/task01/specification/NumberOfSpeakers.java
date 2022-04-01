package by.tc.task01.specification;

public class NumberOfSpeakers implements SetAttribute {
    private int numberOfSpeakers;

    @Override
    public void setAttribute(String value) {
        this.numberOfSpeakers = Integer.parseInt(value);
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }
}
