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
        int sequence = 1;
        int temp = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                temp++;
            } else {
                if (sequence < temp) {
                    sequence = temp;
                    temp = 1;
                }
            }
        }
        System.out.println(Math.max(temp, sequence));
    }
}