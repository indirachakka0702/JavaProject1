
public class Day2 {
	// Data Type, conditional statements( if, ifelse, nested if, Debugging, comments)
// for loop, while loop, do- while continue,for each loop, scope of variables
	// methods and parameters, return types
	public static void main(String[] args) 
	{
		//for(Initialization; condition(validation); increment/Decrement)
		/*for(int i=0; i<7;i++)   // for(int i=1;i<7;i++)
		{
		System.out.println("Indu"+i);
		}  */
		/*for(int i=20;i>1;i=i-2)
		{
			System.out.println("Indu"+i);
		}   */
		// from 10 onwards you are keep on increasing, 10>2 but this is not best practice
		//Arrays
		/*for(datatype variableName : arrayName)
		{
			//code executed
		}  */
		
		/*String car = "Audi";
		String [] cars = {"BMW","Ford","Toyota","Mercedes"};*/
		/*for(String str: cars)
		{
			System.out.println(str);
		}  */
		/*for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}  */
		// while loop
	  /*	while(condition)
		{
			// statement(s);
		}   */
		/*int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}  */
		// Do while
	/*	do
		{
			statement(s);
		} while(condition);   */
		/*int j=1;
		do
		{
			System.out.println(j);
			j++;
		} while(j<10);*/
		// Break and continue statement
	/*	for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==5) 
			{
				break;
				}
			System.out.println(i);
		}
		System.out.println("Outside of the loop");*/
	/* for(int i=0;i<=10;i++)
		{
			if(i==5|| i==6) 
			{
				continue;
				}
			System.out.println(i);
		}
		System.out.println("Outside of the loop");   */
	/*	int count=0;
		for(int i=1; i<10;i++) 
		{
			int scope2=20;
			System.out.println(scope2);
		   for(int j=0;j<5;j++)
		   {
			   int scope1=10;
			   System.out.println(scope1);
			   System.out.println(scope2);
			   System.out.println("count of i "+i+" and j= "+j);
			   count++;
		   }
		   System.out.println(scope2);
		}
		System.out.println("outside of the loop"+count);    */
		
	
		
	}

}
