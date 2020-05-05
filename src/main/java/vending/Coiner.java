/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending;

/**
 *
 * @author imaki
 */
public class Coiner {
    private final double COIN1 = 0.10;
    private final double COIN2 = 0.20;
    private final double COIN3 = 0.50;
    private final double NOTE = 1;
    private double amount;

    public Coiner() {
    }

    public double getCOIN1() {
        return COIN1;
    }

    public double getCOIN2() {
        return COIN2;
    }

    public double getCOIN3() {
        return COIN3;
    }

    public double getNOTE() {
        return NOTE;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
    
}
