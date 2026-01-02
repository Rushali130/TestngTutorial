package Interfaces;

public class Interfacedemo implements interfaces, continentalTraffic {
	
	public static void main(String[] args) {
	
	//Whatever methods written in interfaces , need to override in main code but outside the main methods to implement
    //Create a object of class to implements method presents in interface.
		
		interfaces ab=new Interfacedemo();
	    ab.greenGo();
	    ab.redStop();
	    ab.flashYellow();
		
		//One class can implements more than 1 interfaces
	    
	    continentalTraffic a=new Interfacedemo();
	    a.TrainSymbol();
	    
    }

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		//Code
		System.out.println("Green Go implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation" );
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow implementation");
		
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		
	}
}

		

	
	

	

	
