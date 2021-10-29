package inheritance;

public class Car extends Vehicle {
    public enum TransmissionType {
        MANUAL, AUTO
    }

    private int gear = 0;
    private int maxGear;
    private int passengers = 0;
    private int maxPassengers;
    private TransmissionType transmission;

    public Car(int maxSpeed, int maxCarrying, int maxGear, int maxPassengers,
               TransmissionType transmission) {
        super(maxSpeed, maxCarrying);

        this.maxGear = Math.max(maxGear, 0);
        this.maxPassengers = Math.max(maxPassengers, 0);
        this.transmission = transmission;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if (gear < 0 || gear > this.maxGear) {
            System.out.println("Invalid gear!");
            return;
        }
        this.gear = gear;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers < 0 || passengers > this.maxPassengers) {
            System.out.println("Invalid passengers number!");
            return;
        }
        this.passengers = passengers;
    }
}
