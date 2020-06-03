
public class Day2_1 {

	// methods and parameters
	public static void main(String[] args)
	{
		// repeted task
	  /*	int a=add(10,15);
	  	System.out.println(a);
	  	int b=sub(20,5);
	  	System.out.println(b);
	  	int c=add(30,45);
	  	System.out.println(c);
    printMyname();   */
    printNumberfromTo(10,20);
	}
	private static void printNumberfromTo(int from,int to)
	{
		for(int i=from;i<=to;i++) 
		{
		   System.out.println(i);	
		}
	}

	static int add(int num1, int num2)
	{
		return num1+num2;
	}
	static int sub(int num1, int num2)
	{
		return num1-num2;
	}
	static void printMyname()
	{
		System.out.println("Indu");
	}
}

