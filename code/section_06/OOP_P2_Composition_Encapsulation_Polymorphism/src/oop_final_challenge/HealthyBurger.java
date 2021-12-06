package oop_final_challenge;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        if (price < 0) {
            System.out.println("Invalid addition price!");
            return;
        }

        if (name.length() == 0) {
            System.out.println("Invalid addition name!");
            return;
        }

        if (this.healthyExtra1Price > 0) {
            System.out.println("Addition have been added already. Cannot " +
                    "substitute!");
            return;
        }
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        if (price < 0) {
            System.out.println("Invalid addition price!");
            return;
        }

        if (name.length() == 0) {
            System.out.println("Invalid addition name!");
            return;
        }

        if (this.healthyExtra2Price > 0) {
            System.out.println("Addition have been added already. Cannot " +
                    "substitute!");
            return;
        }
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (this.healthyExtra1Price > 0) {
            System.out.printf("Added %s for an extra %.2f\n",
                    this.healthyExtra1Name, this.healthyExtra1Price);
            totalPrice += this.healthyExtra1Price;
        }

        if (this.healthyExtra2Price > 0) {
            System.out.printf("Added %s for an extra %.2f\n",
                    this.healthyExtra2Name, this.healthyExtra2Price);
            totalPrice += this.healthyExtra2Price;
        }

        return totalPrice;
    }
}