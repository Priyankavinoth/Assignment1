package week1.day1;

public class Car {

	private void applyBreak() {
		System.out.println("Applied break");

	}
	private void soundHorn() {
		System.out.println("Sound Horn");

	}
	public static void main(String[] args) {
		
	Car obj= new Car();
	obj.applyBreak();
	obj.soundHorn();
	}
}