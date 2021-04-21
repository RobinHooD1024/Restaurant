package cars;

public class Fleet {

    public static void main(String[] args) {

        Car camry = new Car("Camry", 2021, 32);
        Car corolla = new Car("Corolla", 2015, 35);
        Car tacoma = new Car("Tacoma", 2016, 20);
        Car prius = new Car("Prius", 2010, 50);

        Car[] fleet = {camry, corolla, tacoma, prius};


        FleetUtils.printAllData(fleet, 20000, 3.10);


    }
}
