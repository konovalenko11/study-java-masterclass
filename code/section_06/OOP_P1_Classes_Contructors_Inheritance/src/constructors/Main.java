// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

package constructors;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount.getCustomerName());

        bankAccount.setNumber("11290390");
        bankAccount.setBalance(1000);
        bankAccount.setCustomerName("Some Person");
        bankAccount.setEmail("some.person@gmail.com");
        bankAccount.setPhoneNumber("+12506458712");

        bankAccount.depositFunds(5000);
        bankAccount.withdrawFunds(10000);
        bankAccount.withdrawFunds(1000);

        BankAccount bankAccount1 = new BankAccount("555", 25,
                "aaa", "aaa@email.com",
                "(555)444-33-22");


    }
}
