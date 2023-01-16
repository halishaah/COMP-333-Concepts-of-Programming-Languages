

public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode
    
    public int length() {
    	return 0;
    } // length
    
    public int sum() {
    	return 0;
    } //sum
    
    public boolean contains(final int value) {
    	return false;
    }
    
    public ImmutableList append(final ImmutableList other) {
    	
    	return other;
    }
} // Nil

