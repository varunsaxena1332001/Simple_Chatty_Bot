import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if ((i % 3) == 0) {
                if ((i % 5) == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            // put your code here
        }
    }
}