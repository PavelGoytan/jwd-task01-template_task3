package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.converter.ConverterAppliance;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException {
//		Appliance appliance;
        List<Appliance> appliance;
        ConverterAppliance converterAppliance = new ConverterAppliance();
        List<String> applianceList = converterAppliance.getAppliance();
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(Oven.CAPACITY.toString(), 32);

        appliance = service.find(criteriaOven, applianceList);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.HEIGHT.toString(), 45);
        criteriaOven.add(Oven.DEPTH.toString(), 60);

        appliance = service.find(criteriaOven, applianceList);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

        appliance = service.find(criteriaTabletPC, applianceList);// find(Object...obj)

        PrintApplianceInfo.print(appliance);

    }
}
