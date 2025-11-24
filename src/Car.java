public class Car {

    String brand;
    int year;
    double price;

    Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    void start() {
        System.out.println("The car started");
    }

    void info() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}