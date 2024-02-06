package SimpleGame;

public class Main {
    public static void main(String[] args) {
        Player1  player1 = new Player1("Guru" ,"Sword" ,100);
//        System.out.println(player1.getName());
//        System.out.println(player1.getHelth());
//        System.out.println(player1.getWeapon());
//
//        player1.damageByGun1();
//        player1.damageByGun1();
//        player1.heal();

        Player2 player2 = new Player2("Juju", "Ak 47",100,false);
        player2.damageByGun1();
        player2.damageByGun2();
        player2.damageByGun1();
        player2.heal();

    }
}
