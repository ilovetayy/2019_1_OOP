package assignment_3;

public class Dish {
	//부엌에서 조리하는 음식
	
	private int tableNum;
	private String name;//음식 이름
	private String tool;//조리 도구
	private int time;//조리 시간
	
	public int getTableNum() {
		return tableNum;
	}
	public String getName() {
		return name;
	}
	public String getTool() {
		return tool;
	}
	public int getTime() {
		return time;
	}
	
	public Dish(int num, String Name) {
		tableNum = num;
		name = Name;
		setTool(Name);
		setTime(tool);
	}
	
	public void setTool(String name) {
		//음식에 따라 조리도구 설정
		if(name.equals("ramen") || name.equals("stew")) {
			tool = "pot";
		}
		else if(name.equals("friedrice")) {
			tool = "fryingpan";
		}
		else if(name.equals("ovenroast")) {
			tool = "oven";
		}
	}
	public void setTime(String tool) {
		//조리도구에 따라 조리 시간을 설정
		if(tool.equals("pot")) {
			time = 350;
		}
		else if(tool.equals("fryingpan")) {
			time = 500;
		}
		else if(tool.equals("oven")) {
			time = 1300;
		}
	}
}
