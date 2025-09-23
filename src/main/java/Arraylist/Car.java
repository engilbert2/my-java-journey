package Arraylist;


public class Car {
    String brand;
    String plate;
    int seats;

    Car(String brand, String plate, int seats) {
        this.brand = brand;
        this.plate = plate;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return brand + " "+ plate+"- Seats:" + seats;
    }
}

