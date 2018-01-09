package impl;

import java.util.Arrays;

class LongestPrefix {
	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) {
        	return "";
        }else {
        	if(strs.length == 1) {
            	return strs[0];
            }else {
            	Arrays.sort(strs);
            	String tmp = strs[0];
            	int prefixLength = strs[0].length()-1;
            	while(strs[strs.length-1].contains(tmp)==false && prefixLength > 0) {
            		tmp = tmp.substring(0, --prefixLength);
            	}
            	if(tmp.length()==0) {
            		return "";
            	}else {
            		return tmp;
            	}
            }
        }
	}
	public static void main(String[] args) {
		LongestPrefix longPrefix = new LongestPrefix();
		String [] strs = {"aad","ab","abd"};
		System.out.println(longPrefix.longestCommonPrefix(strs));
	}
}
