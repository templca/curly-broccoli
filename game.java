
/**
 * Write a description of class game here.
 *
 * @author cara templeton
 * @version 25/03/2022
 */

import java.util.Scanner;
public class game
{
    // instance variables - replace the example below with your own
    private int x;
    String house="you're in the house";
    String beach="you're at the beach";
    String path="you're on the path";
    String cave="you're in the cave";
    String coconut="you're on the coconut crab beach";
    String forest="you're in the forest";
    String sea="you're in the sea";
    String hut="you're in the wood hut";
    String kitchen="you're in the kitchen";
    String area[] =  {house, beach, path, cave, coconut, forest, sea, hut, kitchen};
    public int room=0;
    boolean hasCoconut=false;
    boolean areaHouse=true;
    boolean areaBeach=false;
    boolean areaSea=false;
    boolean areaCoconut=false;

    /**
     * Constructor for objects of class game
     */
    public game()
    {
        // initialise instance variables
        x = 0;
        System.out.println(area[room]);
        System.out.println("where would you like to go?");
        Scanner keyboard = new Scanner(System.in);
        String direction;
        if (areaHouse==true) {
        room=0;
        direction=keyboard.nextLine();
        switch(direction){
            case "south": room=room+1;
            System.out.println(area[room]);
            areaBeach=true;
            areaHouse=false;
            break;
            case "east": room=room+2;
            System.out.println(area[room]);
            break;
            default: System.out.println("you can't go that way!");
        }
    }
    if (areaBeach==true) {
        room=1;
        direction=keyboard.nextLine();
            switch(direction){
            case "down": room=room+5;
            System.out.println(area[room]);
            areaBeach=false;
            areaSea=true;
            break;
            case "west": if (hasCoconut=true) {
            room=room+3;
            System.out.println(area[room]);
            areaBeach=false;
            areaCoconut=true; }
            else System.out.println("you can't go that way!");
            break;
            case "north": room=room-1;
            System.out.println(area[room]);
            areaBeach=false;
            areaHouse=true;
            break;
            default: System.out.println("you can't go that way!");
        } 
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
