package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliance) {
        if (appliance.isEmpty()) {
            System.out.println("Appliance is not found");
        } else {
            for (Appliance appliance1 : appliance) {
                System.out.println(appliance1);
            }
        }
    }
}
