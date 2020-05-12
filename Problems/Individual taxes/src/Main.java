import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int companies = scanner.nextInt();
        int[] yearlyIncomes = new int[companies];
        int[] taxRates = new int[companies];
        double[] payments = new double[companies];
        for (int i = 0; i < yearlyIncomes.length; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }
        for (int i = 0; i < taxRates.length; i++) {
            taxRates[i] = scanner.nextInt();
        }
        for (int i = 0; i < payments.length; i++) {
            payments[i] = yearlyIncomes[i] * taxRates[i] / 100.0;
        }
        int index = 1;
        double max = payments[0];
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > max) {
                max = payments[i];
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}