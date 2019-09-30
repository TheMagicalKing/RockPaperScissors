public class RPS {

    int battle(Hand a, Hand b){
        int resultat = -1;
        /**if ( a == Hand.PAPER){
            if (b == Hand.PAPER){
                resultat = 0;
            }
            if (b == Hand.ROCK){
                resultat = 1;
            }
            if (b == Hand.SCISSOR){
                resultat = 2;
            }
        }**/
        if (a == Hand.PAPER && b == Hand.ROCK) return 1;
        else if (a == Hand.PAPER && b == Hand.SCISSOR) return 2;
        else if (a == Hand.PAPER && b == Hand.PAPER) return 0;
        else if (a == Hand.ROCK && b == Hand.SCISSOR) return 1;
        else if (a == Hand.ROCK && b == Hand.PAPER) return 2;
        else if (a == Hand.ROCK && b == Hand.ROCK) return 0;
        else if (a == Hand.SCISSOR && b == Hand.PAPER) return 1;
        else if (a == Hand.SCISSOR && b == Hand.ROCK) return 2;
        else if (a == Hand.SCISSOR && b == Hand.SCISSOR) return 0;
        else return -1;
    }

}
