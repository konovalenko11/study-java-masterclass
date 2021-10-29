// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits
// from this base class.
// Finally, create another class, a specific type of Car that inherits from the
// Car class.
// You should be able to hand steering, changing gears, and moving (speed in
// other words).
// You will want to decide where to put the appropriate state and behaviours
// (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be
// included.
// For you specific type of vehicle you will want to add something specific for
// that type of car.

package inheritance;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(100, 500, 6,
                4, Car.TransmissionType.MANUAL);

        car1.moving(10);
        car1.moving(50);
        car1.moving(50);

        Porsche porsche = new Porsche(300, 300, 8,
                3, Porsche.TransmissionType.AUTO,
                400 );

        porsche.steering(200);
    }
}
