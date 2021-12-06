package oop_final_challenge;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price,
                     String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        if (price < 0) {
            System.out.println("Invalid addition price!");
            return;
        }

        if (name.length() == 0) {
            System.out.println("Invalid addition name!");
            return;
        }

        if (this.addition1Price > 0) {
            System.out.println("Addition have been added already. Cannot " +
                    "substitute!");
            return;
        }
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        if (price < 0) {
            System.out.println("Invalid addition price!");
            return;
        }

        if (name.length() == 0) {
            System.out.println("Invalid addition name!");
            return;
        }

        if (this.addition2Price > 0) {
            System.out.println("Addition have been added already. Cannot " +
                    "substitute!");
            return;
        }

        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        if (price < 0) {
            System.out.println("Invalid addition price!");
            return;
        }

        if (name.length() == 0) {
            System.out.println("Invalid addition name!");
            return;
        }

        if (this.addition3Price > 0) {
            System.out.println("Addition have been added already. Cannot " +
                    "substitute!");
            return;
        }
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        if (price < 0) {
            System.out.println("Invalid addition price!");
            return;
        }

        if (name.length() == 0) {
            System.out.println("Invalid addition name!");
            return;
        }

        if (this.addition4Price > 0) {
            System.out.println("Addition have been added already. Cannot " +
                    "substitute!");
            return;
        }
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;

        System.out.printf("%s hamburger on a %s roll with %s, price is %.2f\n",
                this.name, this.breadRollType, this.meat, this.price);

        if (this.addition1Price > 0) {
            System.out.printf("Added %s for an extra %.2f\n",
                    this.addition1Name, this.addition1Price);
            totalPrice += this.addition1Price;
        }

        if (this.addition2Price > 0) {
            System.out.printf("Added %s for an extra %.2f\n",
                    this.addition2Name, this.addition2Price);
            totalPrice += this.addition2Price;
        }

        if (this.addition3Price > 0) {
            System.out.printf("Added %s for an extra %.2f\n",
                    this.addition3Name, this.addition3Price);
            totalPrice += this.addition3Price;
        }

        if (this.addition4Price > 0) {
            System.out.printf("Added %s for an extra %.2f\n",
                    this.addition4Name, this.addition4Price);
            totalPrice += this.addition4Price;
        }

        return totalPrice;
    }
}