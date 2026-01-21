/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codevaconsolecalculator.task1;

import java.util.Scanner;

/**
 *
 * @author specs
 */
public class CodevaConsoleCalculatorTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter First Number:");
            int Num1 = sc.nextInt();

            System.out.println("Enter Math Operator (add, subtract, multiply, divide):");
            String Op = sc.next().toLowerCase(); 

            System.out.println("Enter Second Number:");
            int Num2 = sc.nextInt();

            switch (Op) {
                case "add" -> 
                    System.out.println(Num1 + " + " + Num2 + " = " + (Num1 + Num2));

                case "subtract" -> 
                    System.out.println(Num1 + " - " + Num2 + " = " + (Num1 - Num2));

                case "multiply" -> 
                    System.out.println(Num1 + " × " + Num2 + " = " + (Num1 * Num2));

                case "divide" -> {
                    if (Num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        double result = (double) Num1 / Num2;
                        System.out.println(Num1 + " ÷ " + Num2 + " = " + result);
                    }
                }

                default -> 
                    System.out.println("Invalid operation entered!");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid numbers only!");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
