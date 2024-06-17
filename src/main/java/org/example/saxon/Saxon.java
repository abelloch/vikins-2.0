package org.example.saxon;
import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public String msg;

//constructor
    public Saxon(int health, int strength) {
        super(health, strength);
    }
    //attack
    public int attack() {
        return strength;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void receiveDamage(int damage) {
        if (health - damage > 0) {
            health -= damage;
            msg = ("A Saxon has received"+damage+ "points of damage");
            System.out.println(msg);
        } else {
            health = 0;
            msg = "A Saxon has died in combat";
            System.out.println(msg);
        }



    }

}