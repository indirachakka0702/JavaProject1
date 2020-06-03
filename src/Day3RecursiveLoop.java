
public class Day3RecursiveLoop {
	static int count = 0;

	public static void main(String[] args)
	{
	   // Recursive ---> calling methods inside the method itself recursively
		// func();	
		System.out.println(factorial(6));
	}
	
	/*static void func()
		{
		count++;
		if(count<=5)
		{
			System.out.println("Hello :: "+count);
	          func();
		}
		// factorial of a number ---> n*(n-1)*(n-2)*....*1
	}  */
      static int factorial(int n)
      {
    	  if(n==1)
    		  return 1;
    	  else
    		  return (n*factorial(n-1));
      }
}
