public class MainKinderGarden {

    public static void main(String[] args) {

        Child c1 = new Child("Alice", 101, 5.5, "Good behavior");
        Child c2 = new Child("Bob", 102, 7.0, "Likes reading");
        Child c3 = new Child("David", 103, 6.5, "Very active");
        Child c4 = new Child("Emma", 104, 8.0, "Needs attention");
        Child c5 = new Child("John", 105, 4.5, "Friendly");
        Child c6 = new Child("Kate", 106, 9.0, "Excellent progress");
        Child c7 = new Child("Michael", 107, 10.5, "Calm and focused");
        Child c8 = new Child("Olivia", 108, 3.5, "New student");
        Child c9 = new Child("Daniel", 109, 6.0, "Likes games");
        Child c10 = new Child("Sophia", 110, 7.5, "Creative");

        Parent p1 = new Parent("John Smith", 201, "555-1001", "12 Oak Street");
        Parent p2 = new Parent("Mary Johnson", 202, "555-1002", "34 Maple Avenue");
        Parent p3 = new Parent("David Brown", 203, "555-1003", "56 Pine Road");
        Parent p4 = new Parent("Sarah Davis", 204, "555-1004", "78 Cedar Lane");
        Parent p5 = new Parent("Michael Wilson", 205, "555-1005", "90 Birch Drive");
        Parent p6 = new Parent("Jennifer Moore", 206, "555-1006", "15 Elm Street");
        Parent p7 = new Parent("Robert Taylor", 207, "555-1007", "27 Willow Court");
        Parent p8 = new Parent("Lisa Anderson", 208, "555-1008", "39 Cherry Avenue");
        Parent p9 = new Parent("James Thomas", 209, "555-1009", "41 Walnut Road");
        Parent p10 = new Parent("Patricia Jackson", 210, "555-1010", "53 Spruce Drive");

        Garden garden =
                new Garden("Sun", "Berlin, Herzel 4", "+380563345", "Anna Coen");

        garden.addToGarden(c10, p10);
        garden.addToGarden(c9, p9);
        garden.addToGarden(c8, p8);
        garden.addToGarden(c7, p7);
        garden.addToGarden(c6, p6);
        garden.addToGarden(c5, p5);
        garden.addToGarden(c4, p4);
        garden.addToGarden(c3, p3);
        garden.addToGarden(c2, p2);
        garden.addToGarden(c1, p1);

        garden.printChildren();

        garden.addToGarden(c6, p6);

        garden.removeFromGarden(110);

        garden.printChildren();
    }
}