package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
	static Stack<Character> chars = new Stack<Character>();
	static int num = 0;
	static boolean empty = false;
	static char storage = ' ';
	static int counter = 0;
    public static boolean doBracketsMatch(String b) {
    	
    	for(int i =0; i < b.length(); i++) {
    		chars.push(b.charAt(i));
    	}
    	if(!(b.length() % 2 == 0)) {
    		return false;
    	}
    	for(int i =0; i < chars.size(); i++) {
    		storage = chars.pop();
    		if(storage == '}') {
    			counter++;
    		}
    		else if(storage == '{') {
    			if(counter != 0) {
    				counter--;
    			}
    			else {
    				empty = true;
    			}
    		}
    		
    		
    		
    	}
    	if(counter == 0 && empty == false) {
			return true;
		}
		else {
			return false;
		}        
    }
}