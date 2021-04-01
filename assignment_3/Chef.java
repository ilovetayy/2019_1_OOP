package assignment_3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Chef extends Thread {
	//������ �ϴ� ����
	
	private String name;//�̸�
	private Kitchen kitchen;//�ֹ�
	private ArrayList<Dish> dishes;//�����ؾ� �� ���ĵ�
	
	public Chef(String Name, Kitchen k, ArrayList<Dish> Dishes) {
		name = Name;
		kitchen = k;
		dishes = Dishes;
	}
	
	//Chef Thread�� running ���°� �Ǿ��� ��� ������ ������ run method
	public void run() {		
		int i = 0;
		while(i < dishes.size()) {
			if(dishes.get(i).getTool().equals("oven")) {
				try {
					kitchen.useOven();
					Thread.sleep(dishes.get(i).getTime());
					System.out.println("Table #"+dishes.get(i).getTableNum()+" / "+dishes.get(i).getName()
							+" is completed by "+name+". "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(System.currentTimeMillis()));
					System.out.flush();
					kitchen.releaseOven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if(dishes.get(i).getTool().equals("fryingpan")) {
				try {
					kitchen.useFryingpan();
					Thread.sleep(dishes.get(i).getTime());
					System.out.println("Table #"+dishes.get(i).getTableNum()+" / "+dishes.get(i).getName()
							+" is completed by "+name+". "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(System.currentTimeMillis()));
					System.out.flush();
					kitchen.releaseFryingpan();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if(dishes.get(i).getTool().equals("pot")) {
				try {
					kitchen.usePot();
					Thread.sleep(dishes.get(i).getTime());
					System.out.println("Table #"+dishes.get(i).getTableNum()+" / "+dishes.get(i).getName()
							+" is completed by "+name+". "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(System.currentTimeMillis()));
					System.out.flush();
					kitchen.releasePot();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			i++;
		}
	}
}
