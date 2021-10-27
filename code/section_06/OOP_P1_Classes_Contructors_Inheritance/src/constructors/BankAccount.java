package constructors;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("23424234", 23, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName,
                       String email, String phoneNumber) {
        System.out.println("Constructor with parameters called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (double amount) {
        this.balance += (amount >= 0) ? amount : 0;
        System.out.printf("$%s were deposited to the account. Balance: $%s\n",
                amount, this.balance);
    }

    public void withdrawFunds (double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.printf("$%s were withdrawn. Balance: $%s\n", amount,
                    this.balance);
        } else {
            System.out.printf("$%s can't be withdrawn. Balance: $%s\n", amount,
                    this.balance);
        }
    }
}
