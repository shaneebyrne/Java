package DAT305Assingments;
/** Class that solves Towers of Hanoi problem. */
public class TowerOfHanoi
{
    /** Recursive method for "moving" disks.
     pre: startPeg, destPeg, tempPeg are different.
     @param //n is the number of disks
     @param //startPeg is the starting peg
     @param //destPeg is the destination peg
     @param //tempPeg is the temporary peg
     @return A string with all the required disk moves
     */
    public static String showMoves(int n, char startPeg, char destPeg, char tempPeg)
    {
        if (n == 1)
        {
            return "Move disk 1 from peg " + startPeg +
                   " to peg " + destPeg + "\n";
        } else {  // Recursive step
            n = n-1;
            return showMoves(n, startPeg, tempPeg, destPeg)
                   + "Move disk " + n + " from peg " + startPeg
                   + " to peg " + destPeg + "\n"
                   + showMoves(n, tempPeg, destPeg, startPeg);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(showMoves(3, 'R', 'M', 'L'));
    }
}
