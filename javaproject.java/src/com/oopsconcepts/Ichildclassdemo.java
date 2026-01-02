package com.oopsconcepts;

public class Ichildclassdemo extends IParentclassdemo{
	
	//if we have 2 same variable in child and parent class then super keyword refers to parent class
	String name="rushali";
	public void engine()
	{
		System.out.println(name);
		System.out.println(super.colour);
	}
	public void brakes()
	{
		super.brakes();
		System.out.println("brakes is implemented");
	}
	public void colour()
	{
		System.out.println("colour code is implemented");
	}
	
	public void audiosystem()
	{
		System.out.println("new audio is implemented");
	}
	
	public Ichildclassdemo() {
		super(); //if you want call constructor from parent class then use super keyword but make sure its should be in first line only
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		
		Ichildclassdemo cd=new Ichildclassdemo();
		//IParentclassdemo cr= new IParentclassdemo();
		cd.engine();
		cd.brakes();
		cd.colour();
		cd.audiosystem();
	}

}
