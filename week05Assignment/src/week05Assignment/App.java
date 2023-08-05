package week05Assignment;

public class App {

	public static void main(String[] args) {
		
	Logger testAsterisk = new AsteriskLogger(); //creates new instance of the AsteriskLogger class that implements the Logger interface 
	Logger testSpaced = new SpacedLogger();     //creates new instance of the SpacedLogger class that implements the Logger interface 
	
	testAsterisk.log("Hello");
	testAsterisk.error("Hello");
	
	System.out.println("---------------");
	
	testAsterisk.log("Over Flow");
	testAsterisk.error("Over Flow");
	
	System.out.println("---------------");
	
	testSpaced.log("Hello");
	testSpaced.error("Hello");
	
	System.out.println("---------------");
	
	testSpaced.log("Over Flow");
	testSpaced.error("Over Flow");
	
	
	}
}