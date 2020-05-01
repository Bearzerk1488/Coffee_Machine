package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 0;
    public static int milk = 0;
    public static int beans = 0;

    public static void main(String[] args) {
        askForCoffee();
    }

    public static void askForCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        insertStuff(water, milk, beans, cups);
    }

    public static void insertStuff(int water, int milk, int beans, int neededCup) {
        int availableCups = 0;
        int waterPerCup = water / 200;
        int milkPerCup = milk / 50;
        int beansPerCup = beans / 15;
        if (waterPerCup <= milkPerCup && waterPerCup <= beansPerCup) {
            availableCups = waterPerCup;
        } else if (milkPerCup <= waterPerCup && milkPerCup <= beansPerCup) {
            availableCups = milkPerCup;
        } else if (beansPerCup <= waterPerCup && beansPerCup <= milkPerCup) {
            availableCups = beansPerCup;
        }
        if (neededCup == availableCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (neededCup > availableCups) {
            System.out.println("No, I can make only " + availableCups + " cup(s) of coffee");
        } else if (neededCup < availableCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (availableCups - neededCup) + " more than that)");
        }

    }

    public static void hello() {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
    }

    public static void calculateCoffee(int cups) {
        System.out.println("Write how many cups of coffee you will need:");
        System.out.println("For " + cups + " cups of coffee you will need:\n" +
                cups * 200 + " ml of water\n" +
                cups * 50 + " ml of milk\n" +
                cups * 15 + " g of coffee beans\n");
    }
}
