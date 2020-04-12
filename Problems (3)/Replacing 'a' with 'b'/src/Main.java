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
        //creating variable @s1 of String type and initialize it by ""
        String s1 = "";
        //creating for-loop of the length of variable @s and incrementation of 1
        for (int i = 0; i < s.length(); i++) {
            //comparing by condition in which each character is equal to "a"
            //if condition is true then replace "a" by "b" otherwise remains same
            if (s.charAt(i) == 'a') {

                s1 = s1 + "b";
            } else
                s1 = s1 + s.charAt(i);
        }
        //statement to print the value of @s1
        System.out.println(s1);
    }
}