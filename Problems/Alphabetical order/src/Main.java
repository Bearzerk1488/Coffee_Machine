import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().trim().split(" ");
        boolean isAlphabetical = false;
        for (int i = 1; i < arr.length; i++) {
            isAlphabetical = arr[i - 1].compareTo(arr[i]) <= 0;
        }
        System.out.println(isAlphabetical);
    }
}