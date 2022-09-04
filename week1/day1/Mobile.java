package week1.day1;

public class Mobile {

	private void makeCall() {
	System.out.println("Unlimited call");
	String name="Realme";
	float weight=155f;

	}
	private void sendSms() {
    System.out.println("Only 100 sms perday");
    boolean visible=true;
    int cost=1300;
    

	}
	
	public static void main(String[] args) {
		Mobile obj= new Mobile();	
    obj.makeCall();
	obj.sendSms();
	System.out.println("This is my mobile");	
	
	}

}
