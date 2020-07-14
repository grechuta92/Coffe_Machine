package machine;

import java.util.Scanner;

public class MachineTank {
    private int cupOfCoffe = 0;
    private int water = 400;
    private int milk = 540;
    private int beansOfCoffee = 120;
    private int disposableCups = 9;
    private int amountOFmoney = 550;


    public MachineTank(int cupOfCoffe, int water, int milk, int beansOfCoffee, int disposableCups, int amountOFmoney) {
        this.cupOfCoffe = cupOfCoffe;
        this.water = water;
        this.milk = milk;
        this.beansOfCoffee = beansOfCoffee;
        this.disposableCups = disposableCups;
        this.amountOFmoney = amountOFmoney;
    }

    public MachineTank() {
    }

    public void setAmountOFmoney(int amountOFmoney) {
        this.amountOFmoney = amountOFmoney;
    }

    public int getCupOfCoffe() {
        return cupOfCoffe;
    }

    public void setCupOfCoffe(int cupOfCoffe) {
        this.cupOfCoffe = cupOfCoffe;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeansOfCoffee() {
        return beansOfCoffee;
    }

    public void setBeansOfCoffee(int beansOfCoffee) {
        this.beansOfCoffee = beansOfCoffee;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }


    public int getAmountOFmoney() {
        return amountOFmoney;
    }

}
