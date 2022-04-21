package Week1.day1;

public class MyMobile {

	
	public long mobileNumber = 9960052345L;
	
	public String brand = "OnePlus" ;
	
	public void makeCall()
	{
		System.out.println("Hello, sneha This side");
	}
	public void sendMsg()
	{
		System.out.println("How are you");
	}
	private void payBills()
	{
		System.out.println("Please pay bills");
	}
	
	public static void main(String[] args) 
	{
		
		MyMobile obj = new MyMobile();
		System.out.println(obj.brand);
		System.out.println(obj.mobileNumber);
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();
				
	}
	
	
}

