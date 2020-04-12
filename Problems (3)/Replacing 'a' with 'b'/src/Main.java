import java.util.Scanner;

class Main {
    /**
     * creating main() method
     * main() method is of static type
     * creating array @args of String type
     */
    public static void main(String[] args) {
        // put your code here
        //creating object sc of Scanner class
        Scanner sc = new Scanner(System.in);
        //creating variable @s of String type
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