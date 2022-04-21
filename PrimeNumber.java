package Week1.day1;

public class PrimeNumber {
public static void main(String[] args) {
	//to find out prime number
	
	int n=13;
	boolean flag = false;
	
	for (int i=2; i<=n/2; i++)
	{
		if (n%i==0)
		flag =true;
		
	}
	
	if (!flag)
		System.out.println(n+ " is a prime number");
	else
		System.out.println(n+ " is not a prime number");
			
	
}
}
