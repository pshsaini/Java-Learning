package OOPS;

public class PiyushCars implements Car{

	static Car c;//Global Variable
	public static void main(String[] args) {

PiyushCars pc=new PiyushCars();
pc.start();
pc.accel();
pc.stop();
pc.horn();
pc.music();

c=new PiyushCars();
c.start();
c.stop();
c.horn();
c.accel();
c.music();

		
	}
	@Override
	public void music() {
		System.out.println("Music");

	}
	@Override
	public void horn() {
		System.out.println("Horn");

	}
	@Override
	public void stop() {
		System.out.println("Stop");

	}
	@Override
	public void accel() {
		System.out.println("Accel");

	}
	@Override
	public void start() {
		System.out.println("Start");
	}

}
