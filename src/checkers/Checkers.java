/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Hillary
 */
public class Checkers {
    String name;
    String instructions = "This is Classic Checkers \n\n"
            +"You will be playing against the computer. You will be black\n"
            +"and I will be red. The object of the game is to:\n"
            + "1. Capture all your opponent's pieces.\n"
            +"You do this by moving diagonally forwards, and to capture you 'jump'\n"
            + "your opponent's piece by moving to an empty space behind their piece\n"
            +"2. Put them in a position where they can't move anymore.\n\n"
            +"Good luck!!\n\n";
    public static void main(String[] args) {
        Checkers myGame = new Checkers();
        myGame.getName();
        myGame.displayHelp();
      
    }
    
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        
    }
    public void displayHelp() {
        System.out.println("\nHi There "+this.name+"\n");
        System.out.println(this.instructions);
    }
}
