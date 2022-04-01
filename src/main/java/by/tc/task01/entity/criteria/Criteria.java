package by.tc.task01.entity.criteria;

import java.util.*;

public class Criteria {
    public static final String DELIMITER = "=";
    private final String groupSearchName;
    private final Map<String, Object> criteria = new HashMap<>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, Object> getCriteria() {
        return criteria;
    }

    public Set<Map.Entry<String, Object>> getSetCriteria() {
        return criteria.entrySet();
    }

    public Set<String> getKey() {
        return criteria.keySet();
    }

    public List<String> parameterList() {
        List<String> par = new ArrayList<>();
        for (Map.Entry<String, Object> setCriterion : getSetCriteria()) {
            par.add(setCriterion.getKey() + DELIMITER + setCriterion.getValue());
        }
        return par;
    }
}
