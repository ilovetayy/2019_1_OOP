package oop_quiz2;

public class NotInDicException extends Exception{
	public NotInDicException() {
		super("this word not exists in dictionary");
	}
	public NotInDicException(String messg) {
		super(messg);
	}
}
