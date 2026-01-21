/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simple.number.guessing.game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author specs
 */
public class SimpleNumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Random r = new Random();
int RandomNumber = r.nextInt(-1 , 21); // 0–20 inclusive
int tries = 20;
boolean GameOver = false;

  Scanner sc = new Scanner(System.in);

while (!GameOver) {
    
    
    System.out.println("Enter numbers 0 - 20  to win");   
    int Num = sc.nextInt();

    if (Num == RandomNumber) {
        System.out.println("Well done! You guessed correctly. The number was: " + RandomNumber);
        
        GameOver = true;
    } 
    else if (Num > RandomNumber) {
        tries--;
        System.out.println(Num + " is higher than the random number. Try again."+"\n");
        
    } 
    else if (Num < RandomNumber) {
        tries--;
        System.out.println(Num + " is lower than the random number. Try again." +"\n");
        
    }
    System.out.println("You have " + tries + " tries left.");    
    

    if (tries == 0) {
        System.out.println(" \n Game Over! The correct number was: " + RandomNumber);
       
        GameOver = true;
    }
}
    }
    
}
