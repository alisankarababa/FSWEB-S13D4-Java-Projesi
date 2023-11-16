package com.workintech.model;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private int correctedHealth(int health) {
        if(health > 100)
            return 100;

        if(health < 0)
            return 0;

        return health;
    }

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        this.healthPercentage = correctedHealth(healthPercentage);
    }
    public int healthRemaining() {
        return healthPercentage;
    }
    public void loseHealth(int damage) {
        if(damage < 0)
            return;
        healthPercentage = correctedHealth(healthPercentage - damage);
        if(healthPercentage == 0)
            System.out.println(name + " player has been knocked out of game");
    }

    public void restoreHealth(int healthPotion) {
        if(healthPotion < 0)
            return;

        healthPercentage = correctedHealth(healthPercentage + healthPotion);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
