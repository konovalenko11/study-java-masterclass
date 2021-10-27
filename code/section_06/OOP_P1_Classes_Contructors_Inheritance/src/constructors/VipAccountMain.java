package constructors;

public class VipAccountMain {
    public static void main(String[] args) {
        VipAccount account1 = new VipAccount("aa", 123,
                "a@gmail.com");
        System.out.println(account1.toString());

        account1 = new VipAccount("name", 300);
        System.out.println(account1.toString());

        account1 = new VipAccount();
        System.out.println(account1.toString());
    }
}
