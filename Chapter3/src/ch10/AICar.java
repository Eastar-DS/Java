package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("auto drive");
		System.out.println("car change direction");
	}

	@Override
	public void stop() {
		System.out.println("AI stop");		
	}
	
}
