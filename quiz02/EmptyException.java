package oop_quiz2;

public class EmptyException extends Exception{
	public EmptyException() {
		super("list is empty");
	}
	public EmptyException(String messg) {
		super(messg);
	}
}
