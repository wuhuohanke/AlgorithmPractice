package impl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {
	public boolean isPalindrome(int x) throws InputMismatchException {
		if(x < 0){
			return false;
		}else{
			if(x > Integer.MAX_VALUE){
				throw new InputMismatchException();
			}else{
				String tmp = new String();
				String input = x + "";
				for(int i = input.length(); i > 0; i--) {
					tmp += input.substring(i - 1, i);
				}
				if(input.toString().equals(tmp.toString())){
					return true;
				}else {
					return false;
				}
			}
		}
    }
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer. Is it a palindrome?");
		try {
			int input = scan.nextInt();		
			System.out.println(p.isPalindrome(input));
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect type of data.");
		}
	}
}
