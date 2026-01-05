public class TransportationTester {
    public static void main(String[] args) {

        Helicopter helicopter = new Helicopter();
        Airplane airplane = new Airplane();
        SpaceShuttle spaceShuttle = new SpaceShuttle();

        Truck truck = new Truck();
        SUV suv = new SUV();
        Tricycle tricycle = new Tricycle();
        Motorcycle motorcycle = new Motorcycle();
        Kariton kariton = new Kariton();

        Boat boat = new Boat();
        Submarine submarine = new Submarine();

        helicopter.fly();
        airplane.fly();
        spaceShuttle.fly();

        truck.drive();
        suv.drive();
        tricycle.drive();
        motorcycle.drive();
        kariton.drive();

        boat.sail();
        submarine.sail();
    }
}
