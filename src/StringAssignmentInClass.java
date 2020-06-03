
public class StringAssignmentInClass {

	public static void main(String[] args) 
	{
		String str1= "Hi I am srinidhi";
        for(int i=str1.length()-1;i>=0;i--)
        {
        	System.out.print(str1.charAt(i));
        }   
		
		/*String sInput = "HI I am srinidhi";
		char[] cInput = sInput.toCharArray();
		for(int i=cInput.length-1;i>=0;i--)
		{
			System.out.println(cInput[i]);
		}   */
		
        System.out.println("");
      String sInput1 = "Hi I am srinidhi";
       String[] sArrInput = sInput1.split(" ");
      /* for(String str:sArrInput)
       {
    	   System.out.println(str);
       }*/ 
       
       
      for(int k=(sArrInput.length-1);k>=0;k--)
       {
    	   System.out.print(sArrInput[k]+" ");
       }
   
        /* for(int k=(sArrInput.length-1);k>=0;k--)
         {
        	 char[] temp= sArrInput[k].toCharArray();
        	 System.out.println(" ");
        	 for(int j=temp.length-1;j>=0;j--)
        	 {
        	 System.out.print(temp[j]);
        	 }
         }*/
	}

}
