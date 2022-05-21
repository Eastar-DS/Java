package ch10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("person drive");
		System.out.println("person use handle");
	}

	@Override
	public void stop() {
		System.out.println("stop manually");
	}

}
