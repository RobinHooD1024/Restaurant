package cars;

public class FleetUtils {

    public static void printFleetData(Car[] fleet) {
        for (Car v: fleet) {
            System.out.println(v.getYear()+" "+v.getName()+" "+v.getMpg());
        }
    }

    public static double getAverageAge(Car[] fleet) {
        int ageSum = 0;
        for (Car v : fleet) {
            ageSum += 2021 - v.getYear();
        }
        double result = (double) ageSum / fleet.length;
        return result;
    }

    public static double getFuelCost(Car[] fleet, int mileage, double pricePerGalon) {
        int cost = 0;
        for (int i = 0; i < fleet.length; i++) {
            cost += mileage / fleet[i].getMpg() * pricePerGalon;

        }
        return cost;
    }

    public static void printAllData(Car[] fleet, int mileage, double pricePerGalon) {
        FleetUtils.printFleetData(fleet);
        double avgAge = getAverageAge(fleet);
        System.out.println(avgAge);
        double fuelCost = getFuelCost(fleet, mileage, pricePerGalon);
        System.out.println("Fuel cost: $"+fuelCost);
    }
}
