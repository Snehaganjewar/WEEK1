package Week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		
	
    Calculator obj = new Calculator();
	
	int add = obj.Addition(3,2,5);
	System.out.println(add);
	
	int sub = obj.getSubraction(8,3);
	System.out.println(sub);
	
	double mul = obj.getMultiplication(2,3);
	System.out.println(mul);
	
	float divide = obj.getDivision(8,3);
	System.out.println(divide);
}
}
