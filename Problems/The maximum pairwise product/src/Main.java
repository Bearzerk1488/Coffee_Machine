import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int product = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            product = arr[i] * arr[i - 1];
            if (product > max) {
                max = product;
            }
        }
        System.out.println(max);
    }
}