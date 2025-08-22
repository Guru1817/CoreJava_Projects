package GuesserGame;

import java.util.Scanner;

class Guesser{
    int guesserNumber;
    int numberFromGuesser(){
        System.out.println("GuesserGame.Guesser guess the number : ");
        Scanner sc = new Scanner(System.in);
        guesserNumber = sc.nextInt();
        return guesserNumber;
    }
}
class player{
    int playerNumber;
    int numberFromPlayer(){
        System.out.println("GuesserGame.player guess the number : ");
        Scanner sc = new Scanner(System.in);
        playerNumber= sc.nextInt();
        return playerNumber;
    }
}
class umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser =  g.numberFromGuesser();
    }
    void collectFormPlayer(){
        player p1 = new player();
        numFromPlayer1 = p1.numberFromPlayer();
        player p2 = new player();
        numFromPlayer2 = p2.numberFromPlayer();
        player p3 = new player();
        numFromPlayer3 = p3.numberFromPlayer();
    }
    void compare(){
        if (numFromPlayer1 == numFromGuesser){
            if (numFromPlayer2 == numFromGuesser && numFromPlayer3 ==numFromGuesser){
                System.out.println("All players won the game");
            } else if (numFromPlayer2 == numFromGuesser) {
                System.out.println("Only player1 and player2 won the game ");
            } else if (numFromPlayer3 ==numFromGuesser) {
                System.out.println("Only player1 and player3 won the game");
            }else {
                System.out.println("Only player1 won the game");
            }
        } else if (numFromPlayer2 == numFromGuesser) {
            if (numFromPlayer3 ==numFromGuesser){
                System.out.println("Only player2 and player3 won the game ");
            }else {
                System.out.println("Only player2 won the game");
            }
        } else if (numFromPlayer3 ==numFromGuesser) {
            System.out.println("Only player3 won the game");
        }else {
            System.out.println("No GuesserGame.player won the game");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        umpire u = new umpire();
        u.collectFromGuesser();
        u.collectFormPlayer();
        u.compare();
    }
}
