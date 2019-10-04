import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many times would you like to play?");
        int turnAmount = input.nextInt();
        rpsPlay(turnAmount);
    }

    public static void rpsPlay(int turnAmount) {

        Scanner input = new Scanner(System.in);
        RPS playRPS = new RPS();

        int count = 0;
        while (count < turnAmount) {
            Hand comHand = null;
            int handInt = (int) (Math.random() * 3);
            if (handInt == 0) comHand = Hand.ROCK;
            if (handInt == 1) comHand = Hand.PAPER;
            if (handInt == 2) comHand = Hand.SCISSOR;

            //System.out.println("How many times would you like to play?");
            //int turnAmount = input.nextInt();

            Hand playHand = null;
            System.out.println("Please input your Rock, Paper, Scissor choice");
            String playString = input.next();
            if (playString.equalsIgnoreCase("rock")) playHand = Hand.ROCK;
            if (playString.equalsIgnoreCase("paper")) playHand = Hand.PAPER;
            if (playString.equalsIgnoreCase("scissor")) playHand = Hand.SCISSOR;
            //playRPS.multiBattle(playHand,comHand,turnAmount);
            System.out.println("Computer's hand is: " + comHand);
            System.out.println(playRPS.battle(playHand, comHand));
            int resultat = playRPS.battle(playHand, comHand);

            if (resultat == 0) System.out.println("Computer played the same hand as you, it's a draw");
            if (resultat == 1) System.out.println("Computer played the wrong hand you win");
            if (resultat == 2) System.out.println("Computer played the right hand Computer wins");
        count++;
        }
    }
}
