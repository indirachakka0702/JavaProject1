
public class Day4String {
	//Strings

	public static void main(String[] args)
	{
		 /*String str = "Hello";
		 //String is not primitive data
		 //String is a separate class
		 System.out.println(str);
		 System.out.println(str.length());
		 System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf("H"));
        System.out.println(str.replace("e", "M"));
        System.out.println(str.indexOf("l"));
        
        String str1 = "indu";
        String str2 = "priya";
        System.out.println(str1+str2);
        String sText = "dr\nfg"+"hhg";//   \n -> it moves to next line;  \t ->it peans space  \b ->it prints character there
        System.out.println(sText);// sText. -->assignment  
*/		 // String is immutable
	    String str1 = "Indu";
		 String str2 = "Priya";  // hashcode save the place in future to use same place
		 System.out.println("str1 hashcode(): " +str1.hashCode());
		 System.out.println("Before: ");
		 System.out.println("str2 hashcode(): " +str2.hashCode());
		 str2 = str1;  // str2 = Priya -> orphan
		 System.out.println("After: ");
		 System.out.println("str2 hashcode(): "+str2.hashCode());
		 str1 = str1+"XXX";
		 System.out.println(str1);
		 System.out.println(str2);
		 str2 = "Priya";
		 System.out.println("str2 hashcode(): "+str2.hashCode());// hashcode same last time allocate
		 
		/* int i=10; // will not be left orphan
		 int j=20;
		 i=j;
		 System.out.println(i);   */
		 
		 // There cannot be more than 1 string with same value in memory
		 // String cannot change value, instead a new string is formed always
		 
//Heap Memory
 // run time memory
 // JVM starts up-> when you start running program
 // Maximum size of this heap is set to be 64MB,you can also fix heap memory using -Xmx
		  // another way of declaring string value
		 //String --> Literal
		 String str10 = "priya";
		 String str20 = "priya";
		 
		 String s10 = new String("priya");
		 String s20 = new String("priya");
		 
		 System.out.println(str10==str20);
		 System.out.println(str10.equals(str20));
		 
		 System.out.println("with new keyword : "+s10==s20);
        System.out.println("with new keyword: "+s10.equals(s20));
        
        // when you say == it compares object reference
       // when you say .equals to compare the value
        // use literala--> Always use .euals to compare it
        
        // write a java program to reverse the content of a sentence with out using reverse keyword
     
}
 }
