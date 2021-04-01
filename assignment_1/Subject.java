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
	 * 복사생성자(deep copy)
	 * @param 다른 Subject객체
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
	 * 서로 다른 객체의 이름을 비교하는 method
	 * @param 다른 Subject객체
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
	 * Subject의 이름을 return
	 */
	public String toString() {
		return name;
	}
	/**
	 * Subject의 이름, 교수, 강의실 정보를 리턴하는 method
	 * @return 이름, 교수, 강의실 정보
	 */
	public String getDetails() {
		return "Name: "+name+"\nTutor: "+tutor+"\nRoom: "+room;
	}
}
