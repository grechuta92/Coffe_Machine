package machine;

import java.util.Scanner;

public class MachineInterface {
    MachineTank machineTank = new MachineTank();
    boolean back = false;

    public void start() {
        while (back == false) {
            back = option();
        }

    }


    public void status() {

        System.out.println("\nThe coffe machine has:");
        System.out.println(machineTank.getWater() + " of water");
        System.out.println(machineTank.getMilk() + " of milk");
        System.out.println(machineTank.getBeansOfCoffee() + " of coffe beans");
        System.out.println(machineTank.getDisposableCups() + " of disposable cups");
        System.out.println("$" + machineTank.getAmountOFmoney() + " of money");

    }


    public boolean option() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        String coffe;

        switch (action) {
            case "buy": {
                System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                coffe = scanner.next();
                if (!coffe.equals("back")) {
                    chooseACoffe(Integer.parseInt(coffe));
                    break;
                } else {
                    break;
                }
            }

            case "fill": {
                fillATank();
                break;
            }

            case "take": {
                getMoney();
                break;
            }

            case "remaining": {
                status();
                break;

            }

            case "exit": {
                return true;
            }

            default:
                option();
                break;
        }
        return false;

    }


    public void chooseACoffe(int number) {

        switch (number) {
            case 1: {
                prepareACoffe("Espresso");
                break;
            }
            case 2: {
                prepareACoffe("Latte");
                break;
            }
            case 3: {
                prepareACoffe("Cappucino");
                break;
            }
            default: {
                System.out.println("Wrong number! Try again!");
                break;
            }
        }
    }

    public void prepareACoffe(String type) {


        switch (type) {
            case "Espresso": {
                if (machineTank.getWater() - 250 >= 0 && machineTank.getBeansOfCoffee() >= 16) {
                    enoughResources();
                    machineTank.setWater(machineTank.getWater() - 250);
                    machineTank.setBeansOfCoffee(machineTank.getBeansOfCoffee() - 16);
                    machineTank.setAmountOFmoney(machineTank.getAmountOFmoney() + 4);
                    machineTank.setDisposableCups(machineTank.getDisposableCups() - 1);
                } else if (machineTank.getWater() < 250) {
                    noWater();
                } else if (machineTank.getBeansOfCoffee() < 16) {
                    noBeans();
                }
                break;
            }

            case "Latte": {
                if (machineTank.getWater() - 350 >= 0 && machineTank.getBeansOfCoffee() >= 20 && machineTank.getMilk() >= 75) {
                    enoughResources();
                    machineTank.setWater(machineTank.getWater() - 350);
                    machineTank.setBeansOfCoffee(machineTank.getBeansOfCoffee() - 20);
                    machineTank.setMilk(machineTank.getMilk() - 75);
                    machineTank.setAmountOFmoney(machineTank.getAmountOFmoney() + 7);
                    machineTank.setDisposableCups(machineTank.getDisposableCups() - 1);
                } else if (machineTank.getWater() < 350) {
                    notEnoughWater();
                } else if (machineTank.getBeansOfCoffee() < 16) {
                    noBeans();
                } else if (machineTank.getMilk() < 75) {
                    notEnoughMilk();
                }
                break;
            }
            case "Cappucino": {
                if (machineTank.getWater() - 200 >= 0 && machineTank.getBeansOfCoffee() >= 12 && machineTank.getMilk() >= 100) {
                    enoughResources();
                    machineTank.setWater(machineTank.getWater() - 200);
                    machineTank.setBeansOfCoffee(machineTank.getBeansOfCoffee() - 12);
                    machineTank.setMilk(machineTank.getMilk() - 100);
                    machineTank.setAmountOFmoney(machineTank.getAmountOFmoney() + 6);
                    machineTank.setDisposableCups(machineTank.getDisposableCups() - 1);
                } else if (machineTank.getWater() < 200) {
                    notEnoughWater();
                } else if (machineTank.getBeansOfCoffee() < 12) {
                    noBeans();
                } else if (machineTank.getMilk() < 100) {
                    notEnoughMilk();
                }
                break;
            }
        }

    }

    private void enoughResources() {
        System.out.println("I have enough resources, making you a coffee!");
    }

    private void notEnoughMilk() {
        System.out.println("\nSorry, not enough milk");
    }

    public void notEnoughWater() {
        System.out.println("\nSorry, not enough water!");
    }

    public void noBeans() {
        System.out.println("\nSorry, not enough coffe beans!");
    }

    public void noWater() {
        System.out.println("\nSorry, not enough water!");
    }

    public void fillATank() {
        Scanner scanner = new Scanner(System.in);
        int addWater = 0;
        int addMilk = 0;
        int addBeansOfCoffe = 0;
        int addDiposableCups = 0;

        System.out.println("Write how many ml of water do you want to add:");
        addWater = scanner.nextInt();
        machineTank.setWater(machineTank.getWater() + addWater);

        System.out.println("Write how many ml of milk do you want to add:");
        addMilk = scanner.nextInt();
        machineTank.setMilk(machineTank.getMilk() + addMilk);

        System.out.println("Write how many grams of coffee beans do you want to add:");
        addBeansOfCoffe = scanner.nextInt();
        machineTank.setBeansOfCoffee(machineTank.getBeansOfCoffee() + addBeansOfCoffe);

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        addDiposableCups = scanner.nextInt();
        machineTank.setDisposableCups(machineTank.getDisposableCups() + addDiposableCups);


    }

    public void getMoney() {
        System.out.println("I gave you " + machineTank.getAmountOFmoney());
        machineTank.setAmountOFmoney(0);

    }

}
