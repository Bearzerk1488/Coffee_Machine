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
        int min = arr[0];
        for (int var : arr
        ) {
            if (min > var) {
                min = var;
            }
        }
        System.out.println(min);
    }
}