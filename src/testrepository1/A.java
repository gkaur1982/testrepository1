package testrepository1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the scale (C or F):");
        String scale = scanner.next().toUpperCase();

        double convertedTemperature;

        switch (scale) {
            case "C":
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println("Converted temperature: " + convertedTemperature + " °F");
                break;
            case "F":
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println("Converted temperature: " + convertedTemperature + " °C");
                break;
            default:
                System.out.println("Invalid scale entered.");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
