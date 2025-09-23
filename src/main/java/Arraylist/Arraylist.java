package Arraylist;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();

        list.add(new Car("Volvo V40" , "XYZ 201845", 5));
        list.add(new Car ("Citrogen C1", "ABC 164521", 4));
        list.add(new Car("Dodge Ram" , "KLM 845990", 2));

        Comparator<Car> carBrandComparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.brand.compareTo(car2.brand);
            }
        };
        Collections.sort(list, carBrandComparator);

        for (Car car : list) {
            System.out.println(car.brand + " - " + car.plate + " - Seats: " + car.seats);
        }

    }
}



