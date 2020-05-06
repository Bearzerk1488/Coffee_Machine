import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        long first = Long.parseLong(arr[0]);
        long second = Long.parseLong(arr[2]);
        switch (arr[1]) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(first / second);
                }
                break;
            case "*":
                System.out.println(first * second);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}