package impl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInteger {
	public int reverse(int x) throws InputMismatchException {
		String input = new String();
		String tmp = new String();
		//tmp = null;
		input = x + "";
		int result = 0;
		int len = input.length();
//		String firstTmp = input.substring(0,1);
//		System.out.println(firstTmp);
		if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
			throw new InputMismatchException();	
		}else{
			if("-".equals(input.substring(0, 1))){
				tmp += input.substring(0,1);
				for(int i = len; i > 1; i--){
					tmp += input.substring(i - 1, i);
				}
			}else{
				for(int i = len; i > 1; i--){
					tmp += input.substring(i - 1, i);
				}
			}
			result = Integer.parseInt(tmp);
			return result;
		}	
    }
	
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer, we will reverse it.");
		try {
			int input = scan.nextInt();		
			System.out.println(ri.reverse(input));
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println(0);
		}
		scan.close();
	}
}
