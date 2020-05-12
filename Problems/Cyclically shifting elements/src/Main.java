import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = new int[length];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result[0] = arr[i];
            } else {
                result[i + 1] = arr[i];
            }
        }
        for (int n : result
        ) {
            System.out.print(n + " ");
        }
    }
}