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
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean isPresent = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == n && arr[i - 1] == m || arr[i] == m && arr[i - 1] == n) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);
    }
}