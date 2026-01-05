public class Transportation {
    protected String name;

    public Transportation(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving.");
    }
}

public class AirTransport extends Transportation {
    public AirTransport(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " is flying in the air.");
    }
}

public class Helicopter extends AirTransport {
    public Helicopter() {
        super("Helicopter");
    }
}

public class Airplane extends AirTransport {
    public Airplane() {
        super("Airplane");
    }
}

public class SpaceShuttle extends AirTransport {
    public SpaceShuttle() {
        super("Space Shuttle");
    }
}

public class LandTransport extends Transportation {
    public LandTransport(String name) {
        super(name);
    }

    public void drive() {
        System.out.println(name + " is moving on land.");
    }
}

public class Truck extends LandTransport {
    public Truck() {
        super("Truck");
    }
}

public class SUV extends LandTransport {
    public SUV() {
        super("SUV");
    }
}

public class Tricycle extends LandTransport {
    public Tricycle() {
        super("Tricycle");
    }
}

public class Motorcycle extends LandTransport {
    public Motorcycle() {
        super("Motorcycle");
    }
}

public class Kariton extends LandTransport {
    public Kariton() {
        super("Kariton");
    }
}

public class WaterTransport extends Transportation {
    public WaterTransport(String name) {
        super(name);
    }

    public void sail() {
        System.out.println(name + " is moving on water.");
    }
}

public class Boat extends WaterTransport {
    public Boat() {
        super("Boat");
    }
}

public class Submarine extends WaterTransport {
    public Submarine() {
        super("Submarine");
    }
}
