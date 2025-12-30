package testNGUsage;

import org.testng.annotations.Test;

public class PassvaluefromtestthroughParameterizedConstructor extends PS1{
	
	@Test
	public void testrun() {
	
		PS2 ps2= new PS2(3,6); //Paramterized constructor
		int a=3;
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		dothis();
		
		//PS3 ps3=new PS3(3);
		System.out.println(ps2.multiplyTwo());
		System.out.println(ps2.multiplyThree());
	}


	
}