//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answer1 = JOptionPane.showInputDialog("How many nickels do you have bruh?");
		// Convert their answer to an int using Integer.parseInt()

int answerInt1 = Integer.parseInt(answer1);
		// Ask the user how many dimes they have, and convert their answer
String answer2 = JOptionPane.showInputDialog("How many dimes do you have bruh?");
int answerInt2 = Integer.parseInt(answer2);
		// Ask the user how many quarters they have, and convert their answer
String answer3 = JOptionPane.showInputDialog("How many quarters do you have bruh?");
int answerInt3 = Integer.parseInt(answer3);
		// Calculate how much money the user has and save it in a double variable 
double cashola = answerInt1*0.05 + answerInt2*0.1 + answerInt3*0.25;

JOptionPane.showMessageDialog(null, cashola +" dollars");
		// Tell the user how much money they have

	}
}

