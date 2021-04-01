package Assignment_1;

public class TimeTable {
	//classType이 Subject인 이차원배열 timeTable_arr: 10행, 5열
	private Subject[][] timeTable_arr = new Subject[10][5];
	//default 생성자
	public TimeTable() {
		initialize();
	}
	
	private void initialize() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(i==2) {
					timeTable_arr[i][j] = new Subject("BREAK");
					//모든 요일의 3교시는 쉬는시간
				}
				else if(i==6) {
					timeTable_arr[i][j] = new Subject("LUNCH");
					//모든요일의 7교시는 점심시간
				}
				else{
					timeTable_arr[i][j] = new Subject("----");
				}
			}
		}
	}
	/**
	 * timeTable_arr의 열(요일)에 인덱스로 접급할 수 있도록 하는 method
	 * @param day
	 * @return 월요일부터 금요일까지: 0부터 4까지
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
	 * 요일과 교시를 입력받아 해당 Subject를 리턴하는 method
	 * @param day(요일)
	 * @param period(교시)
	 * @return 해당 Subject
	 */
	public Subject getSchedule(String day, int period) {
		if(getNumByDay(day) == -1 || period > 10 || period < 1) {
			return null;
		}else {
			return timeTable_arr[period-1][getNumByDay(day)];
		}
	}
	/**
	 * 과목의이름이 ---- break lunch 가 아닌 모든 과목을 담은 subject 배열을 리턴하는 method
	 * @return Subject배열
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
	 * title을 받아서 이에 해당하는 이름이 있는 Subject를 리턴하는 method
	 * @param title
	 * @return title이 이름인 Subject, 못F으면 null 리턴
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
	 * 과목의 정보를 입력받아 과목을 추가하는 method
	 * @param day(요일)
	 * @param period(교시)
	 * @param name(이름)
	 * @param tutor(교수)
	 * @param room(강의실)
	 * @return 쉬는 시간이나 점심시간을 인자로 받으면 return false, 아니면 과목 추가 후 return true
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
	 * 시간표를 출력하는 method
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
