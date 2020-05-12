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
        int counter = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == (arr[i - 1] + 1) && arr[i] == (arr[i - 2] + 2)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}