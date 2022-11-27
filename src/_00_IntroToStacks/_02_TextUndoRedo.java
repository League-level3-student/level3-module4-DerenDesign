package _00_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class _02_TextUndoRedo implements KeyListener {
    /* 
     * Create a JFrame with a JPanel and a JLabel.
     * 
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is erased from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped  off the Stack and added back to
     * the JLabel.
     */
	Stack<Character> chars = new Stack<Character>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	public static void main(String[] args) {
		_02_TextUndoRedo runner = new _02_TextUndoRedo();
		runner.start();
	}
	public void start() {
		frame.add(panel);
		panel.add(label);
		frame.setSize(600,600);
		frame.addKeyListener(this);
		label.addKeyListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char value = e.getKeyChar();
		
		if(e.getKeyCode() == e.VK_BACK_SPACE) {
			chars.push(label.getText().charAt(label.getText().length()-1));
			//System.out.println(chars);
			label.setText(label.getText().substring(0,label.getText().length()-1));
			
		}
		else if(e.getKeyCode() == e.VK_ENTER) {
			char pop = chars.pop();
			label.setText(label.getText()+ pop + "");
			System.out.println(chars);
			System.out.println(pop+"");
		}
		else {
			label.setText(label.getText()+ value + "");
		}
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
