package Strings;

public class palindromeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String sb=new String("madam");
        String t="";
        
        for(int i=sb.length()-1;i>=0;i--) {
        	 t=t+sb.charAt(i);
        }
        System.out.println(t);
        
        if(t==sb) {
        	System.out.println("String is palindrome");
        }else
        	System.out.println("String is not palindrome");
        }
	}

