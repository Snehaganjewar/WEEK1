package Week1.day1;

public class NegativeOrPositiveNum {
public static void main(String[] args) {
	int n= 0; int pNum;
	
	{
	  if (n<0)
	     System.out.println(n+" is negative number");
	  else
	     System.out.println(n+" is positive number");
	}
	
	{
	  if(n<0)
		  System.out.println(n+ " is negative number");
	  else
		  	  if(n>0)
		         System.out.println(n+ " is positive number");
	          else
		         System.out.println(n+" is neither negative nor positive");
		  
	}
	
		
	if(n<0) 
	{
	pNum = n *(-1);
	
	System.out.println(n+" is converted to " +pNum);
	}
}
}
