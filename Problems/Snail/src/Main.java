import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int days = 0;
        int f = 0;
        while (f < h) {
            f = f + a;
            days++;
            if (f >= h)
                break;
            f = f - b;
        }
        System.out.println(days);
    }
}