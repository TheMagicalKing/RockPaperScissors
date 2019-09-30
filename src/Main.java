public class Main {

    public static void main(String[] args) {
        Hand nicki = Hand.PAPER;
        Hand mik = Hand.ROCK;
        RPS round1 = new RPS();
        System.out.println(round1.battle(mik, nicki));
    }

}
