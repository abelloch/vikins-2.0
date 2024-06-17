package org.example.vikins;
import org.example.soldier.Soldier;

    public class Vikings extends Soldier{
    public String name;
    public String msg;



        //constructor
    public Vikings(String name, int health, int strength, String msg) {
    super(health, strength);
    this.name = name;
    this.msg = msg;
    }


        //metodo receiveDamage
     void receiveDamage(int damage) {
        if (health - damage > 0) {
            health -= damage;
            msg  = (name+ "has received" + damage + "points of damage");
            System.out.println(msg);
        } else {
            health = 0;
            msg = (name+"has died in combat");
            System.out.println(msg);
        }
    }


    //method battleCry
    public static String battleCry() {
        return "Odin Owns You All!";
    }

    //getters and setters


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String Msg) {
            this.msg = Msg;
        }
    }


