
/**
 * Write a description of class game here.
 *
 * @author cara templeton
 * @version 12/05
 */
public class game
{
    // instance variables - replace the example below with your own
    private int x;
    boolean present [][] = new boolean [20][20];
    boolean future [][] = new boolean [20][20];
    
    

    /**
     * Constructor for objects of class game
     */
    public game()
    {
        // initialise instance variables
        x = 0;
        
        for (int x=0;x<20;x++){
            for (int y=0;y<20;y++){
                System.out.print(present[x][y] + " ");
            }
            System.out.println();
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
