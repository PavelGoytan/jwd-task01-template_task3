package by.tc.task01.specification;

public class OperationSystem implements SetAttribute {
    private String os;

    @Override
    public void setAttribute(String value) {
        this.os = value;
    }

    public String getOs() {
        return os;
    }
}
