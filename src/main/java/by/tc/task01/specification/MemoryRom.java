package by.tc.task01.specification;

public class MemoryRom implements SetAttribute {
    private int memoryRom;

    @Override
    public void setAttribute(String value) {
        this.memoryRom = Integer.parseInt(value);
    }

    public int getMemoryRom() {
        return memoryRom;
    }
}
