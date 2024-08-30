public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base number:");
        double base = scanner.nextDouble();
        System.out.println("Enter exponent:");
        int exponent = scanner.nextInt();
        System.out.println("Result: " + power(base, exponent));
    }