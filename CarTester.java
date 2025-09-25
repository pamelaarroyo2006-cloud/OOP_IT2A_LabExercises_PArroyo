import java.util.ArrayList;
import java.util.List;

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: $" + price);
        System.out.println(); 
    }
}

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        
        cars.add(new Car("Toyota", "Corolla", 2020, 20000));
        cars.add(new Car("Honda", "Civic", 2021, 22000));
        cars.add(new Car("Ford", "Mustang", 2022, 30000));
        cars.add(new Car("Chevrolet", "Camaro", 2019, 25000));
        cars.add(new Car("BMW", "M3", 2021, 70000));
        cars.add(new Car("Mercedes", "C-Class", 2020, 40000));
        cars.add(new Car("Audi", "A4", 2022, 45000));
        cars.add(new Car("Nissan", "Altima", 2018, 15000));
        cars.add(new Car("Hyundai", "Elantra", 2021, 19000));
        cars.add(new Car("Tesla", "Model 3", 2022, 45000));

        
        for (Car car : cars) {
            car.displayDetails();
        }
    }
}
