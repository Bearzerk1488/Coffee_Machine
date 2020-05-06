package machine;

import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);
    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static boolean isStopped = false;

    public static void main(String[] args) {
        while (!isStopped) {
            askForAction();
        }
    }

    public static void showReport() {
        System.out.println("\nThe coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money");
    }

    private static void askForAction() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
        String action = scanner.nextLine().trim().toLowerCase();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                showReport();
                break;
            case "exit":
                isStopped = true;
                break;
            default:
                System.out.println("No such action!");
        }
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String coffee = scanner.nextLine().trim().toLowerCase();
        switch (coffee) {
            case "1":
                checkSuppliesAndMakingCoffee(250, 0, 16, 1, 4);
                break;
            case "2":
                checkSuppliesAndMakingCoffee(350, 75, 20, 1, 7);
                break;
            case "3":
                checkSuppliesAndMakingCoffee(200, 100, 12, 1, 6);
                break;
            case "back":
                break;
            default:
                System.out.println("No such coffee!");
        }
    }

    private static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        water += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += Integer.parseInt(scanner.nextLine());
    }

    private static void take() {
        System.out.println("I gave you $" + money);
        money -= money;
    }

    private static void checkSuppliesAndMakingCoffee(int neededWater, int neededMilk, int neededBeans, int neededCups, int earnedMoney) {
        int notEnoughResource = 0;
        if (neededWater > water) {
            notEnoughResource = 1;
        } else if (neededMilk > milk) {
            notEnoughResource = 2;
        } else if (neededBeans > beans) {
            notEnoughResource = 3;
        } else if (neededCups > cups) {
            notEnoughResource = 4;
        }
        switch (notEnoughResource) {
            case 0:
                System.out.println("I have enough resources, making a coffee!");
                water -= neededWater;
                milk -= neededMilk;
                beans -= neededBeans;
                cups -= neededCups;
                money += earnedMoney;
                break;
            case 1:
                System.out.println("Sorry, not enough water!");
                break;
            case 2:
                System.out.println("Sorry, not enough milk!");
                break;
            case 3:
                System.out.println("Sorry, not enough coffee beans!");
                break;
            case 4:
                System.out.println("Sorry, not enough disposable coffee cups!");
        }
    }
}

