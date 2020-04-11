import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), d = "";
        String b = sc.nextLine(), c = "";
        a = a.replaceAll("\\s+", "");
        b = b.replaceAll("\\s+", "");
        System.out.println(a.equals(b));

    }
}