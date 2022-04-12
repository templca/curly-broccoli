/**
 * Write a description of class game here.
 *
 * @author cara templeton
 * @version 25/03/2022
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class gam
{
    // instance variables - replace the example below with your own
    private int x;
    boolean running = true;
    String house="you're at the house";
    String beach="you're at the beach";
    String path="you're on the path";
    String cave="you're in the cave";
    String coconut="you're on the coconut crab beach";
    String forest="you're in the forest";
    String sea="you're in the sea";
    String hut="you're in the wood hut";
    String kitchen="you're in the kitchen";
    String area[]= {house, beach, path, cave, coconut, forest, sea, hut, kitchen};
    boolean hasCoco=false;
    boolean hasAxe=false;
    boolean hasWood=false;
    boolean branches=false;
    public int room=0;
    String command;
    String wow;

    /**
     * Constructor for objects of class game
     */
    public gam()
    {
        // initialise instance variables
        x = 0;
        File rooms=new File("roomtext.txt");
        try{
            Scanner readfiles = new Scanner(rooms);
            while (readfiles.hasNextLine()){
                wow=(readfiles.nextLine());
            }
            String parts[]=wow.split("123");
            for (int i=0;i<parts.length;i++) {
                System.out.println(parts[i]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        room=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(area[room]);
        System.out.println("Where would you like to go?");

        while (running=true) {
            command=keyboard.nextLine();
            switch (command) {
                case "south": 
                if (room==0) {
                    room=1;
                    System.out.println(area[room]);
                } else if (room==5) {
                    room=room-2;
                    System.out.println(area[room]);
                } else {
                    System.out.println("you can't go that way!");
                }
                break;
                case "west":
                if (room==1 && hasAxe) {
                    room=room+3;
                    System.out.println(area[room]);
                } else if (room==1 && !hasAxe) { 
                    System.out.println("you can't go that way!");
                } else if (room==2) {
                    room=room-2;
                    System.out.println(area[room]);
                }
                else if (room==5) {
                    room=room+2;
                    System.out.println(area[room]);
                } else {
                    System.out.println("you can't go that way!");
                }
                break;
                case "north": 
                if (room==1) {
                    room--;
                    System.out.println(area[room]);
                } else  {
                    System.out.println("you can't go that way!");
                }
                break;
                case "east": 
                if (room==0) {
                    room=room+2;
                    System.out.println(area[room]);
                } else if (room==4){
                    room=room-3;
                    System.out.println(area[room]);
                } else if (room==7){
                    room=room-2;
                    System.out.println(area[room]);
                } else {
                    System.out.println("you can't go that way!");
                }
                break;
                case "down":
                if (room==1) {
                    room=room+5;
                    System.out.println(area[room]);
                } else if (room==2){
                    room=room+3;
                    System.out.println(area[room]);
                } else {
                    System.out.println("you can't go that way!");
                }
                break;
                case "up":
                if (room==6) {
                    room=room-5;
                    System.out.println(area[room]);
                } else if (room==5){
                    room=room-3;
                    System.out.println(area[room]);
                } else if (room==3) {
                    room=room+5;
                    System.out.println(area[room]);
                } else {
                    System.out.println("you can't go that way!");
                }
                break;
                case "pick up":
                if (room==4 && !hasCoco) {
                    System.out.println("you have picked up a coconut crab!");
                    hasCoco=true;
                } else if (room==4 && hasCoco) {
                    System.out.println("you already have one");
                } else if (room==7 && !hasAxe) {
                    System.out.println("you now have an axe");
                    hasAxe=true;
                } else if (room==7 && hasAxe) {
                    System.out.println("there's nothing here to pick up");
                } else {
                    System.out.println("nothing to pick up");
                }
                break;
                case "use crab":
                break;
                case "use axe":
                if (room==1 && hasAxe && !branches) {
                    System.out.println("you cut down the branches");
                    branches=true;
                } else if (room==1 && hasAxe && branches) {
                    System.out.println("branches already cut.");
                } else if (room!=1 && room!=5 && hasAxe) {
                    System.out.println("nothing good to chop here...");
                } else if (room==5 && hasAxe && !hasWood) {
                    System.out.println("you got some useless wood...");
                    hasWood=true;
                } else if (room==5 && hasAxe && hasWood) {
                    System.out.println("you don't need more useless wood..");
                }else { 
                    System.out.println("you dont have an axe!");
                }
                break;
                case "place wood":
                case "use wood":
                if (hasWood==true && room!=7) {
                    System.out.println("the wood uselessly plopped on the ground...");
                    hasWood=false;
                } else if (room==7 && hasWood) {
                    System.out.println("good firewood maybe????");
                    hasWood=false;
                }
                else {
                    System.out.println("what??? you don't have any wood.");
                }
                break;
                default: System.out.println("try something else");
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