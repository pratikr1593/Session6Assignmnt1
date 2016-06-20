//Defining an interface and its implementation in two 
//different classes in different ways. 

interface Interface{
	
public void run();
public void walk();

}


public class Interfaces implements Interface{

	
	public void run() {
		
		
		System.out.println("I can see people running in Joggers park");
		
		
	}

	
	public void walk() {
		
		System.out.println("I can see people walking");
	}
	
	
	
public static void main(String args[]){
	
	Interfaces J = new Interfaces();
	
	J.run();
	J.walk();
	
	
	
}
}





