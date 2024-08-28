```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base number:");
        double base = scanner.nextDouble();
        System.out.println("Enter exponent:");
        int exponent = scanner.nextInt();
        System.out.println("Result: " + power(base, exponent));
    }

    static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double temp = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return temp * temp;
        } else {
            if (exponent > 0) {
                return base * temp * temp;
            } else {
                return (temp * temp) / base;
            }
        }
    }
}
```