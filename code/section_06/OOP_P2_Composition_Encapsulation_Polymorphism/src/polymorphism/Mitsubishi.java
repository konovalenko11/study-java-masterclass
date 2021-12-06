package polymorphism;

public class Mitsubishi extends Car {
    private String className = this.getClass().getSimpleName();

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return String.format("%s -> startEngine()", className);
    }

    @Override
    public String accelerate() {
        return String.format("%s -> accelerate()", className);
    }

    @Override
    public String brake() {
        return String.format("%s -> brake()", className);
    }
}