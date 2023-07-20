package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel ="ONE PLUS NORD" ;
	    float mobileWeight =45.5f ;
	    System.out.println("MobileModel:" +mobileModel);
	    System.out.println("Mobile Weight:" +mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=30000;
		System.out.println("Mobile fully charged:"+isFullCharged);
		System.out.println("Mobile Cost:"+mobileCost);
	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
		
	}

}
