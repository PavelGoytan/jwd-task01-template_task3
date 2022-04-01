package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria, List<String> appliances) throws IllegalAccessException, IOException {

        if (!Validator.criteriaValidator(criteria)) {
            return new ArrayList<>();
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();


        return applianceDAO.find(criteria, appliances);
    }

}

