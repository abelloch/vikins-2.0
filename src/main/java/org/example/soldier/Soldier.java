package org.example.soldier;

public class Soldier {

    public int health;
    public int strength;

    //builder
    public Soldier(int health, int strength) {
    this.health = health;
    this.strength = strength;
    }


    //methods


    //attack
    public int attack() {
        return strength;
    }

    //receiveDamage
     void receiveDamage(int damage) {
        health = health - damage;
    }

    //getters
    public int getHealth() {
        return health;
    }

    public int getStrength() {
            return strength;
        }


}

