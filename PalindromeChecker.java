package CodingTest.Day2;

import java.util.*;
public class PalindromeChecker{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
		boolean rs=isPalindrome(st);
		if(rs)
			//If posible then print the palindrom.
		{
			System.out.println(getPalindrome(st));
			System.out.println("Palindrome possble");
		}
	
			
		else
			System.out.println("Palindrome not possble");
			
		
	}
	static boolean isPalindrome(String str){
		int count[] = new int[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
			
		}
		int odd =0 ;
		for(int i=0; i<count.length ; i++) {
			if(count[i]%2 == 1)
				odd++;	
		}
		if(odd>1)
			return false;
		else
			return true;
	}
	
	
	static String getPalindrome(String str) {
		int count[] = new int[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}
		String s1 ="" ,s2 = "" ,rs = "" ;
		for(int i=0 ; i<count.length ; i++) {
		
			for (int k = 0; k < count[i]/2; k++) {
				s1 = s1 + (char)i;
				s2 = (char)i + s2 ;
			}
			
			if(count[i]%2 == 1)
				rs = rs +(char)i;
		}
		
		return s1+rs+s2;
	}
}