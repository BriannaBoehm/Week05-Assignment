package week05Assignment;

public interface Logger { //creates a new interface called Logger

	public abstract void log (String string); //both methods are abstract, so they have no body. They will be implemented differently for the new classes that implement this interface. 
	
	public abstract void error (String string);
	
}
