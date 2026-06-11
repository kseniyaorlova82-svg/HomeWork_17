import java.util.TreeMap;

public class Garage {

    private String name;
    private String address;
    private String phone;
    private TreeMap<Car, Owner> cars;

    public Garage(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.cars = new TreeMap<>();
    }

    public void addCar(Car c, Owner ow) {
        cars.put(c, ow);
    }

    public void addCar(Car c, Owner ow, String service) {
        c.setServiceType(service);
        cars.put(c, ow);
    }

    public void printCarsInProcess() {
        for (Car c : cars.keySet()) {
            System.out.println(c + " -> " + cars.get(c));
        }
    }

    public void returnCarToOwner(String regNumber) {
        Car carToRemove = null;

        for (Car c : cars.keySet()) {
            if (c.getRegNumber().equalsIgnoreCase(regNumber)) {
                carToRemove = c;
            }
        }

        if (carToRemove != null) {
            cars.remove(carToRemove);
            System.out.println("Car returned to owner: " + regNumber);
        } else {
            System.out.println("Car not found: " + regNumber);
        }
    }
}
