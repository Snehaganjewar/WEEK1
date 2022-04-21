package Week1.day1;

public class FibonacciSeries {
 public static void main(String[] args) {
	int range = 8, firstnum = 0, secnum= 1, F;
	System.out.println(firstnum);
	for (int i = 1; i < 8; i++)
	{
		System.out.println(secnum);
		F= firstnum + secnum;
		firstnum = secnum;
		secnum=F;
		
	}
}
}
