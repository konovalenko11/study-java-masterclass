package inheritance;

public class Vehicle {

    private int steeringDegrees = 0;
    private int speed = 0;
    private int maxSpeed;
    private int carrying = 0;
    private int maxCarrying;

    public Vehicle(int maxSpeed, int maxCarrying) {
        this.maxSpeed = maxSpeed;
        this.maxCarrying = maxCarrying;
    }

    public void setSteeringDegrees(int steeringDegrees) {
        if (steeringDegrees >= -90 && steeringDegrees <= 90) {
            this.steeringDegrees = steeringDegrees;
        } else {
            System.out.println("Invalid steering angle!");
        }
    }

    public int getSteeringDegrees() {
        return steeringDegrees;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= this.maxSpeed) {
            this.speed = speed;
            System.out.println("New speed: " + this.speed);
        } else {
            System.out.println("Can't drive faster! Max speed: " +
                    this.maxSpeed);
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        if (carrying >= 0 && carrying <= this.maxCarrying) {
            this.carrying = carrying;
        } else {
            System.out.println("Negative or extra carrying. " +
                    "Max carrying: " + this.maxCarrying + "; " +
                    "Current carrying: " + this.carrying
            );
        }
    }

    public int getMaxCarrying() {
        return maxCarrying;
    }

    public void moving(int speedChange) {
        setSpeed(this.speed + speedChange);
    }

    public void steering(int degree) {
        setSteeringDegrees(this.steeringDegrees + degree);
    }
}
