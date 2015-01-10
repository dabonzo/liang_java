package chapter02;

import java.util.Scanner;

/**
 * Created by bonzo on 12/26/14.
 */

public class liang_02_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println(celsius + " degree Celsius in Fahrenheit is: " + fahrenheit);
    }

}
