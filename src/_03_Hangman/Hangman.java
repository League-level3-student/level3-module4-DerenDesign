package _03_Hangman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener {
	Stack<String> words = new Stack<String>();
	JFrame frame;
	JPanel panel;
	int len;
	String word;
	String labelText;
	char[] guesses;
	int lives;
	JLabel label;
public static void main(String[] args) {
	Hangman hangman = new Hangman();
	hangman.start();
}
void start() {
	String input = JOptionPane.showInputDialog("How many numbers do you want to guess? (1-100)");
	int numberWords = Integer.parseInt(input);
	
	for(int i = 0; i < numberWords; i++) {
		words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
	}
	frame = new JFrame();
	label = new JLabel();
	panel = new JPanel();
	frame.setVisible(true);
	frame.add(panel);
	frame.add(label);
	frame.addKeyListener(this);
	
	word = words.pop();
	len = word.length();
	System.out.println(word);
	
	guesses = new char[len];
	
	for(int i = 0; i < len; i++) {
		guesses[i] = '_';
	}
	System.out.println(guesses);
	labelText = String.valueOf(guesses);
	
	label.setText(labelText + "You have" + lives + " lives left!"); 
	
	frame.pack();
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	char let = e.getKeyChar();
	boolean guessed = false;
	int num = 0;
	
	for(int i =0; i < guesses.length; i++) {
		if(word.charAt(i)==let) {
			guesses[i] = let;
			System.out.println(let);
			guessed = true;
		}
	}
	if(guessed == false) {
		lives--;
	}
	
	labelText = String.valueOf(guesses);
	label.setText(labelText + "You have" + lives + " lives left!"); 
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
