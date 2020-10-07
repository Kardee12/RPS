import java.util.*;

/**
 * Each player or team will create their own Player, this is only an example....
 *
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 *
 * You can create additional methods but must have the move method
 *
 */
public class ManishankarKarthik implements Player
{

    private static String name = "ManishankarKarthik";
    private static String description = "Made an array with all rounds that contain scissors. Then i used a for loop to increment my array and if the round number equals tha value in the array, then return S. For all other values that do not work out, return P";
    /**
     * An example of a method - replace this comment with your own
     * You must create some kind of logic of what to play against your opponent...start researching,
     * driver code to be provided MONDAY, 2/27
     *
     * @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     *              Not allowed to touch myMoves
     */
    //Strategy:
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore, int rounds) {
        String myMove = "";
        /*
        Sos Pattern:
        (r)p(2r)p(3r)p(4r)p(5r)p(6r)p
        rprrprrrp
         */
        String retP="p";
        String retS="s";

        int returnS [] = {2,5,9,14,20,27,35,44,54,65,77,90,104,119,135,152,170,189};
        int length = returnS.length;
        //System.out.println("Length is " + length);

        for (int i = 0; i<= length-1;i++ ){
            if (rounds == returnS[i]){
                myMove = retS;
                //System.out.println("Print S now " + myMove + " Round number is " + rounds + " value of i is " + i);
                break;
            }
            if(rounds!= returnS[i]){
                myMove = retP;
            }
//            else {
//                myMove = retP;
//                System.out.println("Move is " + myMove + " Round number is " + rounds + " value of i is " + i);
//                break;
            }


//        for (int x : returnS){
//                if (x == rounds)
//                    myMove = retS;
//                else
//                    myMove=retP;
//                break;
//            }

        return myMove;


//


    }

    /**
     * Returns the name of the player
     *
     * @return      the name of the player
     */
        public String getName(){
            return name;
        }
    }

