package Assignment_1;

public class TimeTable {
	//classType�� Subject�� �������迭 timeTable_arr: 10��, 5��
	private Subject[][] timeTable_arr = new Subject[10][5];
	//default ������
	public TimeTable() {
		initialize();
	}
	
	private void initialize() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(i==2) {
					timeTable_arr[i][j] = new Subject("BREAK");
					//��� ������ 3���ô� ���½ð�
				}
				else if(i==6) {
					timeTable_arr[i][j] = new Subject("LUNCH");
					//�������� 7���ô� ���ɽð�
				}
				else{
					timeTable_arr[i][j] = new Subject("----");
				}
			}
		}
	}
	/**
	 * timeTable_arr�� ��(����)�� �ε����� ������ �� �ֵ��� �ϴ� method
	 * @param day
	 * @return �����Ϻ��� �ݿ��ϱ���: 0���� 4����
	 */
	private int getNumByDay(String day) {
		if(day.equals("MON")) {
			return 0;
		}else if(day.equals("TUE")) {
			return 1;
		}else if(day.equals("WED")) {
			return 2;
		}else if(day.equals("THU")) {
			return 3;
		}else if(day.equals("FRI")) {
			return 4;
		}else {
			return -1;
		}
	}
	/**
	 * ���ϰ� ���ø� �Է¹޾� �ش� Subject�� �����ϴ� method
	 * @param day(����)
	 * @param period(����)
	 * @return �ش� Subject
	 */
	public Subject getSchedule(String day, int period) {
		if(getNumByDay(day) == -1 || period > 10 || period < 1) {
			return null;
		}else {
			return timeTable_arr[period-1][getNumByDay(day)];
		}
	}
	/**
	 * �������̸��� ---- break lunch �� �ƴ� ��� ������ ���� subject �迭�� �����ϴ� method
	 * @return Subject�迭
	 */
	public Subject[] getAllSubjects(){
		Subject[] subjects = new Subject[40];
		int count = 0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(timeTable_arr[i][j].getName().equals("----") == false &&
						timeTable_arr[i][j].getName().equals("BREAK") == false &&
						timeTable_arr[i][j].getName().equals("LUNCH") == false) {
					subjects[count] = new Subject(timeTable_arr[i][j]);
					count++;
				}
			}
		}
		return subjects;
	}
	/**
	 * title�� �޾Ƽ� �̿� �ش��ϴ� �̸��� �ִ� Subject�� �����ϴ� method
	 * @param title
	 * @return title�� �̸��� Subject, ���F���� null ����
	 */
	public Subject getSubjectByTitle(String title) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(timeTable_arr[i][j].getName().equals(title)) {
					return timeTable_arr[i][j];
				}
			}
		}
		return null;
	}
	/**
	 * ������ ������ �Է¹޾� ������ �߰��ϴ� method
	 * @param day(����)
	 * @param period(����)
	 * @param name(�̸�)
	 * @param tutor(����)
	 * @param room(���ǽ�)
	 * @return ���� �ð��̳� ���ɽð��� ���ڷ� ������ return false, �ƴϸ� ���� �߰� �� return true
	 */
	public boolean setSchedule(String day, int period, String name, String tutor, String room) {
		if(period == 3 || period == 7 || getNumByDay(day) == -1 || period > 10 || period < 1) {
			return false;
		}
		else {
			timeTable_arr[period-1][getNumByDay(day)] = new Subject(name, tutor, room);
			return true;
		}
	}
	/**
	 * �ð�ǥ�� ����ϴ� method
	 */
	public void printTimeTable() {
		System.out.println("\tMON\tTUE\tWED\tTHU\tFRI");
		for(int i=0;i<10;i++) {
			System.out.print(i+1+"\t");
			for(int j=0;j<5;j++) {
				System.out.print(timeTable_arr[i][j].toString() + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
