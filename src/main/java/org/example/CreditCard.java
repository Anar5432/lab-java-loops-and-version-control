package org.example;

public class CreditCard {
    private  int points;

    public RewardCard(double balance, int points){
        super(balance);
        this.points = points;
    }
    public void addBalance(double amount){
        balance + amount;
        System.out.println("Reward: added" + amount + " (no limits) -> balance is now"+ balance);
    }
    public void applyPoints(){
        double bonus = ponts * 0.05;
        balance += bonus;
        System.out.println("RewardCard; Appplied" + points " points" + balance);
    }
    }
