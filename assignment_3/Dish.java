package assignment_3;

public class Dish {
	//�ξ����� �����ϴ� ����
	
	private int tableNum;
	private String name;//���� �̸�
	private String tool;//���� ����
	private int time;//���� �ð�
	
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
		//���Ŀ� ���� �������� ����
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
		//���������� ���� ���� �ð��� ����
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
