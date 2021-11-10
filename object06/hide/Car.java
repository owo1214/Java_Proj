package object06.hide;
//교재 267p : getter, setter 실습 ( Car,CarExample)

public class Car {
	
	private int speed;
	private boolean stop;
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
		this.speed = 0;
		return;
		} 
		else {
			this.speed = speed;
		}
	}
		
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed =0;
	}
	

}
