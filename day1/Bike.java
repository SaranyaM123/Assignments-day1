package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Applied break");
		}
	public void soundHorn() {
		System.out.println("sound horn");
	}
	
	public static void main(String[] args) {
		Car ktm = new Car();
		Bike fzs = new Bike();
		
		ktm.applyBreak();
		ktm.soundHorn();
		
		fzs.applyBreak();
		fzs.soundHorn();
		
		

	}
}
	


