import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

	// generic ArrayList stack
	private ArrayList<E> list;

	// Constructor
	public MyStack() {
		list = new ArrayList<E>();
	}

	// Test if stack is empty
	public boolean empty() {
		if (list.isEmpty()	) {
		    return true;
		}
		else {
		return false;}
	}

	// Empty the stack
	public void clear() {
		list = new ArrayList<E>();
	}

	// Push an element to the stack
	public E push(E elt) {
		list.add(elt);
		return elt;
	}

	// Pop an element off the stack
	public E pop() {
		list.remove(0); 
		return null;
	}

	// Peek at top of the stack
	public E peek() {
		try {
			if (empty()) {
				throw new EmptyStackException();
			}
			return list.get(list.size() - 1);
		} catch (EmptyStackException e) {
			System.err.println("\nError: \'peek\' attempted on an empty stack - exception caught!");
			e.printStackTrace();
		}
		return null;

	}

	// Return the size of stack
	public int size() {
		// implement your code
		int Size=list.size();
		return Size;
	}

	// toString override method
	@Override
	public String toString() {
		return list.toString();
	}
	
	public boolean Multiple10(int num){
		boolean check=false;
		if (num%10==0) {
			check=true;
		}
		
		return check;
	}
	public boolean Multiple11(int num){
		boolean check=false;
		if (num%11==0) {
			check=true;
		}
		
		return check;
	}
	
	public boolean subtraction(int num,int num1){
		boolean check=false;
		int subtract = num- num1;
		if (subtract == 0) {
			check=true;
		}
		return check;}
	
	public boolean addition(int num,int num1){
		boolean check=false;
		int add = num+num1;
		if (add == 15) {
			check=true;
		}
		return check;}
	
	public boolean multiply(int num,int num1){
		boolean check=false;
		int mult = num*num1;
		if (mult == 24) {
			check=true;
		}
		return check;}
		 
	public boolean Division(int num,int num1){
		boolean check=false;
		int devide = num/num1;
		if (devide == 3) {
			check=true;
		}
		return check;}
	
	    public boolean EvenorOdd(int number){
	         
	        boolean check = false;
	        if(number%2 == 0){
	            check = true;
	        }
	        return check;
	    
	}

}