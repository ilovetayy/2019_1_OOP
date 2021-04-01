package Assignment_1;

public class Subject {
	
	private String name, tutor, room;
	
	public Subject(String name, String tutor, String room) {
		this.name = name;
		this.tutor = tutor;
		this.room = room;
	}
	
	public Subject(String name) {
		this.name = name;
		tutor = "null";
		room = "null";
	}
	/**
	 * ���������(deep copy)
	 * @param �ٸ� Subject��ü
	 */
	public Subject(Subject another) {
		name = another.name;
		tutor = another.tutor;
		room = another.room;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getTutor() {
		return tutor;
	}
	public String getRoom() {
		return room;
	}
	//setter
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	/**
	 * ���� �ٸ� ��ü�� �̸��� ���ϴ� method
	 * @param �ٸ� Subject��ü
	 * @return boolean
	 */
	public boolean equals(Subject another) {
		if(name.equals(another.name) == true) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Subject�� �̸��� return
	 */
	public String toString() {
		return name;
	}
	/**
	 * Subject�� �̸�, ����, ���ǽ� ������ �����ϴ� method
	 * @return �̸�, ����, ���ǽ� ����
	 */
	public String getDetails() {
		return "Name: "+name+"\nTutor: "+tutor+"\nRoom: "+room;
	}
}
