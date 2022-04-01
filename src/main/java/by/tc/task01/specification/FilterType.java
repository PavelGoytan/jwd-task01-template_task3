package by.tc.task01.specification;

public class FilterType implements SetAttribute {
    private String filterType;

    @Override
    public void setAttribute(String value) {
        this.filterType = value;
    }

    public String getFilterType() {
        return filterType;
    }
}
