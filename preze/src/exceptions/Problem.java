package exceptions;

import java.util.Scanner;

import exceptions.model.Person;
import exceptions.model.Student;

public class Problem {

    public static void main(String[] args) {
        problem01Incrementer("5");

        problem02Ping(new Scanner(System.in));

        problem03PrintGrade(new Person("John", "Bambo"));

        problem04PrintArray(args);

        String result = problem05Print();

    }

    /**
     * Converts a string to integer, increments a value and prints a message on
     * System.out.
     *
     * @param numberAsString
     */
    private static void problem01Incrementer(String numberAsString) {
        System.out.println("problem01Incrementer()");

        try {
            int result = Integer.parseInt(numberAsString);
            result++;
            System.out.println("When we increment the number " + numberAsString + " we get: " + result);
        } catch (NumberFormatException ex) {
            System.out.println("Exception occurred");
        }
    }

    /**
     * Outputs the lines from the scanner. The method will terminate once the lines
     * is equal to "q".
     *
     * @param s
     */
    private static void problem02Ping(Scanner s) {
        System.out.println("problem02Ping()");

        while (s.hasNext()) {
            String line = s.nextLine();
            if (line.equals("q")) {
                break;
            } else
                System.out.println(line);
        }
    }

    /**
     * Downcasts from person to student and prints the grade.
     *
     * @param person
     */
    private static void problem03PrintGrade(Person person) {
        System.out.println("problem03PrintGrade()");

        if (person instanceof Student student)
            System.out.println("Grade: " + student.getGrade());
        else
            System.out.println("test");
    }

    /**
     * Prints all the elements from an input array.
     *
     * @param array
     */
    private static void problem04PrintArray(String[] array) {
        System.out.println("problem04PrintArray()");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Prints the "problem05Print()"
     *
     * @return
     */
    private static String problem05Print() {
        System.out.println(problem05Print());

        return "problem05Print()";
    }

}
