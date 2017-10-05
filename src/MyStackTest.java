import static org.junit.Assert.assertEquals;
import java.lang.Math;
import org.junit.Test;



public class MyStackTest {


	@Test 
	public void testPush()
	   {
		MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      assertEquals (stack.peek(), "world");
	      
	      
	   }
	
	
	@Test
    public void Multiplesof11(){
		MyStack<Integer> number = new MyStack<Integer>();
		number.push(55);
		int num= number.peek();
       assertEquals( true, number.Multiple11(num)); 
       //System.out.println(" stack = " + number);
	}
	
	
	
         
	@Test
    public void Multiplesof10(){
		MyStack<Integer> number = new MyStack<Integer>();
		number.push(10);
		int num= number.peek();
       assertEquals( true, number.Multiple10(num)); 
       //System.out.println(" stack = " + number);
	}
	
	@Test
    public void subtraction(){
		MyStack<Integer> number1 = new MyStack<Integer>();
		number1.push(5);
		number1.push(10);
		int num= number1.peek();
		number1.pop();
		int num1=number1.peek();
		//System.out.println(" stack = " + number1);
       assertEquals( true, number1.subtraction(num,num1)); }
	@Test
    public void addition(){
		MyStack<Integer> adding = new MyStack<Integer>();
		int num=adding.push(5);
		adding.push(10);
		adding.pop();
		int num1=adding.peek();
		System.out.println(num + "+"+ num1);
		assertEquals( true, adding.addition(num,num1)); }
        
	@Test
    public void Multiply(){
		MyStack<Integer> multiply = new MyStack<Integer>();
		int num=multiply.push(4);
		multiply.push(6);
		multiply.pop();
		int num1=multiply.peek();
		assertEquals( true, multiply.multiply(num,num1)); }
	
	@Test
    public void Division(){
		MyStack<Integer> devide= new MyStack<Integer>();
		int num=devide.push(300);
		devide.push(100);
		devide.pop();
		int num1=devide.peek();
		assertEquals( true, devide.Division(num,num1)); }

		

		@Test
	    public void Even(){
	    	MyStack<Integer> stack1 = new MyStack<Integer>();
	    	stack1.push(4);
	    	int num= stack1.peek();
	       assertEquals( true, stack1.EvenorOdd(num));
	        
	}
	    
	    @Test
	    public void oddOdd(){
	    	MyStack<Integer> stack1 = new MyStack<Integer>();
	    	stack1.push(5);
	    	int num= stack1.peek();
	       assertEquals( false, stack1.EvenorOdd(num));
	        
	}
	    @Test
	    public void match(){
	    	MyStack<Integer> stack1 = new MyStack<Integer>();
	    	stack1.push(5);
	    int 	num=stack1.push(4);
	    	if (num==4) {boolean check=true;
	       assertEquals( check,true);}
	        
	}
	    
	    @Test
	    public void ExPonentmatch(){
	    	MyStack<Integer> stack1 = new MyStack<Integer>();
	    int num1=stack1.push(2);
	    int 	num2=stack1.push(3);
	    double num3=Math.pow(num1, num2);
	    	if (num3==8) {boolean check=true;
	       assertEquals( check,true);}}
	    
	    
	    
	    
	
}
