package assignment_3;

public class Kitchen {
	//부엌에서 수행하는 조리 작업들
	
	private int ovenNum;//현재 사용할 수 있는 오븐 개수
	private int fryNum;//현재 사용할 수 있는 프라이팬 개수
	private int potNum;//현재 사용할 수 있는 냄비의 개수
	
	public Kitchen() {
		ovenNum = 1;
		fryNum = 3;
		potNum = 3;
	}
	
	//오븐을 사용하거나 사용 완료를 알림
	public synchronized void useOven() throws InterruptedException{
		if(ovenNum == 0) {
			System.out.println("The oven is in use.");
			System.out.flush();
			wait();
		}
		else {
			ovenNum--;
			
		}
	}
	public synchronized void releaseOven() throws InterruptedException{
		if(ovenNum < 1) {
			ovenNum++;
		}
		notifyAll();
	}
	
	//프라이팬을 사용하거나 사용 완료를 알림
	public synchronized void useFryingpan() throws InterruptedException{
		if(fryNum == 0) {
			System.out.println("The fryingpan is in use.");
			System.out.flush();
			wait();
		}
		else {
			fryNum--;
			
		}
	}
	public synchronized void releaseFryingpan() throws InterruptedException{
		if(fryNum < 3) {
			fryNum++;
		}
		notifyAll();
	}
	
	//pot을 사용하거나 사용완료를 알림
	public synchronized void usePot() throws InterruptedException{
		if(potNum == 0) {
			System.out.println("The pot is in use.");
			System.out.flush();
			wait();
		}
		else {
			potNum--;
		
		}
	}
	public synchronized void releasePot() throws InterruptedException{
		if(potNum < 3) {
			potNum++;
		}
		notifyAll();
	}
}
