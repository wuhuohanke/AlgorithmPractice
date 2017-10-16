package impl;

public class ReverseInteger {
	public int reverse(int x) {
		String input = new String();
		String tmp = new String();
		//tmp = null;
		input.valueOf(x);
		int result = 0;
		int len = input.length();
		if(input.substring(0, 1) == "-"){
			tmp += input.substring(0,1);
			for(int i = len; i > 1; i--){
				tmp += input.substring(i - 1, i);
			}
		}else{
			for(int i = len; i > 0; i--){
				tmp += input.substring(i - 1, i);
			}
		}
		result = Integer.parseInt(tmp);
		return result;
    }
	
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		int result = ri.reverse(-123);
		System.out.println(result);
	}
}
