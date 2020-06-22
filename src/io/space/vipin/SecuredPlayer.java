package io.space.vipin;

public class SecuredPlayer {
    private String name;
    private int health;
    private String weapon;

    public SecuredPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health>0 && health<=100){
            this.health = health;
        }

        this.weapon = weapon;
    }
    public void looseHealth(int damage){
        //System.out.println(this.health);
        this.health=this.health-damage;

        if (this.health<0){
            System.out.println("Player Knocked out");
        }
    }


    public int getHealth() {
        return health;
    }
}
