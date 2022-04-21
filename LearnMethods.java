package Week1.day2;

public class LearnMethods {
	
public static void main(String[] args) {
	
	LearnMethods obj = new LearnMethods();
	
	obj.printCarName();
	
	int regNumber = obj.getCarRegNumber();
	System.out.println(regNumber);
	
	String CarVarient = obj.getCarVarient();
    System.out.println(obj.getCarVarient());
     
    int mul = obj.multiplyTwoNumbers(3,3);
    System.out.println(mul);
	
	
}


 public void printCarName() {
	 System.out.println("KIA");
    
}
    public int getCarRegNumber() {
    int regNumber = 23456789;
    return regNumber;
}
    public String getCarVarient() {
    return "Automatic";
}
   public int multiplyTwoNumbers(int a, int b) {
    return a*b;
}
}