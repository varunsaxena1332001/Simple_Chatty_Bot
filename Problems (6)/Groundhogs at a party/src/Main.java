import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        boolean b = scanner.nextBoolean();
        if ((n < 20 && n > 10) && b == true) {
            System.out.println("true");
        } else if ((n < 20 && n > 10) && b == false) {
            System.out.println("true");
        } else if ((n < 25 && n > 20) && b == false) {
            System.out.println("false");
        } else {
            System.out.println("false");
        }
    }
}