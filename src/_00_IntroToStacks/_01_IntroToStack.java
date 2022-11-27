package _00_IntroToStacks;

import java.util.Random;

import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
        //    Don't forget to import the Stack class
    	Stack<Double> stackz = new Stack<Double>();
        // 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
    	Random ran = new Random();
    	for(int i = 0; i < 101; i++) {
    		stackz.push(ran.nextDouble()*100);
    	}
        // 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
    	String input = JOptionPane.showInputDialog("Enter one number between 0 and 100, inclusive.");
    	String input2 = JOptionPane.showInputDialog("Enter another number between 0 and 100, inclusive.");
        // 4. Pop all the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, print it to the screen.
    	int int1= Integer.parseInt(input);
    	int int2= Integer.parseInt(input2);
    	 if(int2 <= int1) {
         	int temp = int1;
         	int1 = int2; 
         	int2 = temp;
         }
    	 System.out.println("NUM 1: " + int1);
         System.out.println("NUM 2: " + int2);
         System.out.println("Popping elements off stack...");
         System.out.println("Elements between " + int1 + " and " + int2 + ":");
         Double number = 0.00;
         for(int i = 0; i<101; i++) {
         	number = stackz.pop();
         	if(number >= int1 && number <= int2) {
         		System.out.println(number);
         	}
         }
        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Popping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
