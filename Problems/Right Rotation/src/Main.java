import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arrA = scanner.nextLine().trim().split(" ");
        String[] arrB = arrA.clone();
        int rotations = scanner.nextInt();
        if (rotations > arrA.length) {
            rotations %= arrA.length;
        }
        for (int i = 0; i < rotations; i++) {
            for (int j = 0; j < arrA.length; j++) {
                if (j == arrA.length - 1) {
                    arrB[0] = arrA[j];
                } else {
                    arrB[j + 1] = arrA[j];
                }
            }
            arrA = arrB.clone();
        }
        for (String a : arrB
        ) {
            System.out.print(a + " ");
        }
    }
}