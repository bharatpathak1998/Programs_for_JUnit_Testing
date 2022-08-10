package JT3;

import java.util.Scanner;

public class TemperatureConv {
    public static void main(String[] args) {
        double fahrenheit,celsius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose 1=> Fahrenheit to Celsius\nChoose 2=> Celsius to Fahrenheit");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.print("Enter  Fahrenheit temperature : ");
            fahrenheit = sc.nextDouble();
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Celsius temperature is : " +celsius);
        } else if (option == 2) {
            System.out.print("Enter  Celsius temperature : ");
            celsius = sc.nextDouble();
            fahrenheit = ((9 * celsius) / 5) + 32;
            System.out.println("Fahrenheit temperature is : " +fahrenheit);
        } else {
            System.out.print("invalid option");
        }
    }
}
