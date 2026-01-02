package Strings;

public class Stringbuilder {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Rushali");
        System.out.println(sb);
        
       // Char at index 0
        System.out.println(sb.charAt(0));
        
       //Set K at index 0
        sb.setCharAt(0, 'R');
        System.out.println(sb);
        
        //Insert any letter at index
        sb.insert(3, 'n');
        System.out.println(sb);
        
        //delete extra index letter --> if hamne 3, 4 diya toh vo index 4 ko consider nhi krega 
        sb.delete(3, 4);
        System.out.println(sb);
	}

}
