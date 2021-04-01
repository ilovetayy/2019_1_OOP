package assignment_3;

public class Kitchen {
	//�ξ����� �����ϴ� ���� �۾���
	
	private int ovenNum;//���� ����� �� �ִ� ���� ����
	private int fryNum;//���� ����� �� �ִ� �������� ����
	private int potNum;//���� ����� �� �ִ� ������ ����
	
	public Kitchen() {
		ovenNum = 1;
		fryNum = 3;
		potNum = 3;
	}
	
	//������ ����ϰų� ��� �ϷḦ �˸�
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
	
	//���������� ����ϰų� ��� �ϷḦ �˸�
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
	
	//pot�� ����ϰų� ���ϷḦ �˸�
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
