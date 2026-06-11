import java.util.Objects;

public class Car implements Comparable<Car> {

    private String model;
    private int year;
    private String regNumber;
    private String code;
    private String serviceType;

    public Car(String model, int year, String regNumber, String code) {
        this.model = model;
        this.year = year;
        this.regNumber = regNumber;
        this.code = code;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public int compareTo(Car o) {
        return this.regNumber.compareTo(o.regNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return regNumber.equalsIgnoreCase(car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber.toLowerCase());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", regNumber='" + regNumber + '\'' +
                ", code='" + code + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
