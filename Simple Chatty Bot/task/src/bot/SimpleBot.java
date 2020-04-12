package bot;

import java.util.Scanner;
//a program to get the age ,test and simple talk between people
public class SimpleBot {
    // create a object scanner of Scanner class
    //@scanner is static and final type
    final static Scanner scanner = new Scanner(System.in); // Do not change this line
//create main() method
//@main is static and public type
//@args array of String type
    public static void main(String[] args) {
        //calling the greet(assistantName,birthYear) method
        greet("Aid", "2018"); // change it as you need
        //calling remindName() method
        remindName();
        //calling guessAge() method
        guessAge();
        //calling count() method
        count();
        // ...
        //calling test() method
        test();
        //calling end() method
        end();
    }

    //creating greet() method of two variables
    //@assistantName of String type
    //@birthYear of String type
    //greet() method is of void type and also of static type
    static void greet(String assistantName, String birthYear) {
        //statement to print "Hello! My name is {assistantName} ."
        System.out.println("Hello! My name is " + assistantName + ".");
        //statement to print "I was created in {birthYear}."
        System.out.println("I was created in " + birthYear + ".");
        //statement to print "Please, remind me your name."
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.\n");
        int ans = 2;
        int guess = scanner.nextInt();
        while (ans != guess) {
            System.out.println("Please, try again.");
            guess = scanner.nextInt();
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
