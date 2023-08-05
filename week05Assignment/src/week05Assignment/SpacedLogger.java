package week05Assignment;

public class SpacedLogger implements Logger { //implements the Logger interface into the class

	@Override
	public void log(String string) { //creates a method based on the abstract method from the Logger Interface
		for(int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i)+ " ");
		}
		System.out.print("\n");
	}

	@Override
	public void error(String string) { //creates a method based on the abstract method from the Logger Interface
		System.out.print("ERROR: ");
		for(int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i)+ " ");
	} 
		System.out.print("\n");
	}

}
