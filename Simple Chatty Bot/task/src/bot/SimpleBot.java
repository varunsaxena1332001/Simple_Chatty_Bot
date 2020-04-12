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
//create remindName() method
//remindName() method is of void type and is also of static type
//remindName() method is by default public type
    static void remindName() {
        //creating variable @name of String type
        //now scanning variable @name
        String name = scanner.nextLine();
        // this statement print "What a great name you have, {name}!"
        System.out.println("What a great name you have, " + name + "!");
    }
//create guessAge() method
//guessAge() method is of void type and is also of static type
//guessAge() method is by default public type
    static void guessAge() {
        //statement to print "Let me guess your age."
        System.out.println("Let me guess your age.");
        //statement to print "Say me remainders of dividing your age by 3, 5 and 7."
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        //creating variable @rem3
        //@rem3 is of Integer type
        //now scanning variable @rem3
        int rem3 = scanner.nextInt();
        //creating variable @rem5
        //@rem5 is of Integer type
        int rem5 = scanner.nextInt();
        //creating variable @rem7
        //@rem7 is of Integer type
        int rem7 = scanner.nextInt();
//creating variable @age
        //@age is of Integer type

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        //statement to print the age using variable @age
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
//creating count() method
//count() method is not return type
//count() method is of static type
//count() method is by default public type
    static void count() {
        //statement to print "Now I will prove to you that I can count to any number you want."
        System.out.println("Now I will prove to you that I can count to any number you want.");
//creating variable @num
        //@num is of Integer type

        int num = scanner.nextInt();
        //generating for loop from 0 to num by incrementation of 1.
        for (int i = 0; i <= num; i++) {
            //statement to print @i from 1 to @num
            System.out.printf("%d!\n", i);
        }
    }
/**
 * creating test() method
 * it is not return type
 * test() method is of static type
 */
    static void test() {
        //statement to print "Let's test your programming knowledge."
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        //statement to print case number for each method define in main() method
        System.out.println("Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.\n");
        /**
         * creating variable @ans
         * @ans is of Integer type
         * initialize @ans=2
         * */
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
