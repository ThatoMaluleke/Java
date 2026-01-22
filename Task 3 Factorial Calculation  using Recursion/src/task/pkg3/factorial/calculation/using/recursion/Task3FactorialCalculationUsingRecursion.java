/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg3.factorial.calculation.using.recursion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author specs
 */
public class Task3FactorialCalculationUsingRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

System.out.println("Enter a Number");
int one = sc.nextInt();

if (one < 0) {
    System.out.println("We cant provide numbers below zero");
} else {

    BigInteger Answer = BigInteger.ONE;
    int deduction = one;

    while (deduction > 1) {
        Answer = Answer.multiply(BigInteger.valueOf(deduction));
        deduction--;
    }

    System.out.println(one + "! = " + Answer);
}
    }
    
}
