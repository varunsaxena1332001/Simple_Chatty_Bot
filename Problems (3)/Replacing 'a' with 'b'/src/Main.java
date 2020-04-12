import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                s1 = s1 + "b";
            } else
                s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);
    }
}