package inheritance;

public class Porsche extends Car {
    int horsePower;

    public Porsche(int maxSpeed, int maxCarrying, int maxGear,
                   int maxPassengers, TransmissionType transmission,
                   int horsePower) {
        super(maxSpeed, maxCarrying, maxGear, maxPassengers, transmission);
        this.horsePower = horsePower;
    }
}
