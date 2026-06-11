import java.util.*;

public class Garden {

    private String name;
    private String address;
    private String phone;
    private String director;

    TreeMap<Child, Parent> children = new TreeMap<>();

    @Override
    public String toString() {
        return "Garden{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", director='" + director + '\'' +
                ", children=" + children +
                '}';
    }

    public Garden(String name, String address, String phone, String director) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void addToGarden(Child c, Parent p) {
        boolean isExists = children.containsKey(c);

        if (isExists == false) {
            children.put(c, p);
            System.out.println("Added !!!");
        } else {
            System.out.println("Already exists !!!");
        }
    }

    public void printChildren() {
        System.out.println("Garden: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Director: " + director);
        System.out.println("\t\tChildren:");

        Set<Child> keys = children.keySet();

        for (Child key : keys) {
            System.out.println(key);

            Parent value = children.get(key);
            System.out.println("Parent: " + value);
        }

        System.out.println("*************************");
    }

    public void removeFromGarden(int id) {
        Set<Child> keys = children.keySet();

        for (Child key : keys) {
            if (key.getId() == id) {
                children.remove(key);
                System.out.println(key.getName());
                System.out.println("Removed !!!");
                return;
            }
        }

        System.out.println("ERROR: wrong ID");
    }
}
