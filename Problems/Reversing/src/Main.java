import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int temp = 0;
        int reverse = 0;
        while (a > 0) {
            temp = a % 10;
            reverse = reverse * 10 + temp;
            a = a / 10;
        }
        System.out.println(reverse);
    }
}