package Strings;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Rushali");
        sb.append("Modak");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.charAt(4);
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(6, 'y');
        System.out.println(sb);
        
        System.out.println(sb.length());
        
        
        
	}
	
	}


