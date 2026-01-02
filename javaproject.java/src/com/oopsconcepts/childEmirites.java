package com.oopsconcepts;

public class childEmirites extends ParentAircraft{

	public static void main(String[] args) {
		
		childEmirites c=new childEmirites();
		c.bodycolour();
		c.engine();
		c.safetyguidelines();
		

	}

	@Override
	public void bodycolour() {
		System.out.println("Blue colour on the body");
	}

}
//An abstract class in object-oriented programming is a class that cannot be instantiated directly,
//meaning you cannot create objects of that class