package io.space.vipin;

public class Main {

    public static void main(String[] args) {
	SecuredPlayer player=new SecuredPlayer("Matt",500,"Sword");


	player.looseHealth(50);
        System.out.println(player.getHealth());
    }
}
