package week05Assignment;

public class AsteriskLogger implements Logger { //implements the Logger interface into the class

	@Override
	public void log(String string) { //creates a method based on the abstract method from the Logger Interface
		System.out.println("***" + string + "***");
		
	}

	@Override
	public void error(String string) { //creates a method based on the abstract method from the Logger Interface
		System.out.print("\n********************" + "\n***Error: " + string +"***" + "\n********************\n");
	}

}
