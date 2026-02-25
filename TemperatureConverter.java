import java.util.Scanner;

public class TemperatureConverter {
    static double celsiusToFahrenheit(double C) {return ((C * 9 / 5) + 32);}

    static double fahrenheitToCelsius(double F) {return (F - 32) * 5 / 9;}

    static double celsiusToKelvin(double C) {
        return C + 273.15;
    }

    static double kelvinToCelsius(double K) {
        return K - 273.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F = 0;
        double C = 0;
        double K = 0;
        System.out.println("------ Temperature Converter ------");
        while (true) {
            System.out.print("1. Celsius → Fahrenheit\n" + "2. Fahrenheit → Celsius\n" + "3. Celsius → Kelvin\n" + "4. Kelvin → Celsius\n" + "5. Exit\n");
            System.out.println("Enter Your Choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Celsius:");
                    C = sc.nextDouble();
                    F = celsiusToFahrenheit(C);
                    System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", C, F);
                    System.out.println("---------------------------------------");
                    break;

                case 2:
                    System.out.println("Enter Fahrenheit:");
                    F = sc.nextDouble();
                    C = fahrenheitToCelsius(F);
                    System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", F, C);
                    break;

                case 3:
                    System.out.println("Enter Celsius:");
                    C = sc.nextDouble();
                    K = celsiusToKelvin(C);
                    System.out.printf("%.2f Celsius = %.2f Kelvin\n", C, K);
                    break;

                case 4:
                    System.out.println("Enter Kelvin:");
                    K = sc.nextDouble();
                    C = kelvinToCelsius(K);
                    System.out.printf("%.2f Kelvin = %.2f Celsius\n", K, C);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }
}