import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int var = scanner.nextInt();
        boolean isEqual = false;
        for (int n : arr
        ) {
            if (n == var) {
                isEqual = true;
            }
        }
        System.out.println(isEqual);
    }
}