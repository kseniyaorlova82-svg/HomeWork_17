public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", 2020, "AB1234", "C001");
        Car car2 = new Car("Audi", 2019, "CD5678", "C002");
        Car car3 = new Car("Mercedes", 2022, "EF9012", "C003");
        Car car4 = new Car("Volkswagen", 2018, "GH3456", "C004");
        Car car5 = new Car("Toyota", 2021, "KL7890", "C005");
        Car car6 = new Car("Honda", 2017, "MN1122", "C006");
        Car car7 = new Car("Ford", 2023, "OP3344", "C007");
        Car car8 = new Car("Skoda", 2020, "QR5566", "C008");
        Car car9 = new Car("Kia", 2019, "ST7788", "C009");
        Car car10 = new Car("Hyundai", 2022, "UV9900", "C010");

        Owner owner1 = new Owner("Ivan", "111-222", 1, "Berlin");
        Owner owner2 = new Owner("Anna", "333-444", 2, "Munich");
        Owner owner3 = new Owner("Petr", "555-666", 3, "Hamburg");
        Owner owner4 = new Owner("Olga", "777-888", 4, "Bonn");
        Owner owner5 = new Owner("Max", "999-000", 5, "Koln");
        Owner owner6 = new Owner("Kate", "123-456", 6, "Leipzig");
        Owner owner7 = new Owner("John", "654-321", 7, "Dresden");
        Owner owner8 = new Owner("Maria", "222-333", 8, "Stuttgart");
        Owner owner9 = new Owner("Alex", "444-555", 9, "Frankfurt");
        Owner owner10 = new Owner("Sofia", "666-777", 10, "Dortmund");

        Garage garage = new Garage("Best Garage",
                "Main Street 10",
                "999-888");

        garage.addCar(car1, owner1, "Oil change");
        garage.addCar(car2, owner2, "Repair brakes");
        garage.addCar(car3, owner3, "Diagnostics");
        garage.addCar(car4, owner4, "Tire change");
        garage.addCar(car5, owner5, "Engine repair");
        garage.addCar(car6, owner6, "Battery replacement");
        garage.addCar(car7, owner7, "Painting");
        garage.addCar(car8, owner8, "Wheel alignment");
        garage.addCar(car9, owner9, "Suspension repair");
        garage.addCar(car10, owner10);

        System.out.println("Cars in process:");
        garage.printCarsInProcess();

        System.out.println();

        garage.returnCarToOwner("cd5678");

        System.out.println();

        System.out.println("Cars after return:");
        garage.printCarsInProcess();

        System.out.println();

        garage.returnCarToOwner("XX0000");
    }
}