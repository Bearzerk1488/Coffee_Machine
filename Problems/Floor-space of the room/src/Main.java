import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine().trim().toLowerCase();
        double a;
        double b;
        double c;
        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double p = (a + b + c) / 2.0;
                double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(result);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                a = scanner.nextDouble();
                System.out.println(3.14 * a * a);
                break;
            default:
                System.out.println("No such shape!");
        }
    }
}