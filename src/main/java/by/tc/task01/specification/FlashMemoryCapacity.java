package by.tc.task01.specification;

public class FlashMemoryCapacity implements SetAttribute {
    private int flashMemoryCapacity;

    @Override
    public void setAttribute(String value) {
        this.flashMemoryCapacity = Integer.parseInt(value);
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }
}
