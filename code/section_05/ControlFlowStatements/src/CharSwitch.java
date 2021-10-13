public class CharSwitch {
    public static void main(String[] args) {
        char x = 'B';

        switch(x) {
            case 'A':
                System.out.println("Found " + x);
                break;
            case 'B':
                System.out.println("Found " + x);
                break;
            case 'C':
                System.out.println("Found " + x);
                break;
            case 'D':
                System.out.println("Found " + x);
                break;
            case 'E':
                System.out.println("Found " + x);
                break;
            default:
                System.out.println("Haven't found anything for " + x);
        }
    }
}
