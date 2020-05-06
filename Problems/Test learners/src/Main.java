import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What programming language are you learning here?\n" +
//                "1. Java\n" +
//                "2. Kotlin\n" +
//                "3. Scala\n" +
//                "4. Python");
        int val = scanner.nextInt();
        switch (val) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}