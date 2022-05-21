package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		
	}
}
