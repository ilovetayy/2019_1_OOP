package oop_quiz2;
import java.util.ArrayList;

public class DictionaryArray implements Dictionary{
	private ArrayList<WordDefinitionPair> DicList;
	
	public DictionaryArray() {
		DicList = new ArrayList<WordDefinitionPair>();
	}
	
	public ArrayList<WordDefinitionPair> getDicList(){
		return DicList;
	}
	
	public int size() {
		return DicList.size();
	}
	public WordDefinitionPair get(int i) {
		return DicList.get(i);
	}
	public boolean isEmpty() {
		if(DicList.size() == 0) return true;
		else return false;
	}
	
	public void insertEntry(String w, String def) throws AlreadyExistInDicException {
		for(int i=0; i<DicList.size(); i++) {
			if(DicList.get(i).getWord().equals(w) == true) {
				throw new AlreadyExistInDicException();
			}
		}
		DicList.add(new WordDefinitionPair(w, def));
	}
	
	public void getDefinition(String w) throws EmptyException, NotInDicException {
		if(DicList.isEmpty() == true) {
			throw new EmptyException();
		}
		int count = 0;
		for(int i=0; i<DicList.size(); i++) {
			if(DicList.get(i).getWord().equals(w) == true) {
				System.out.println(w+" mean "+DicList.get(i).getDefinition());
				count++;
			}
		}
		if(count == 0) {
			throw new NotInDicException();
		}
	}
	
	public void removeWord(String w) throws EmptyException, NotInDicException {
		if(DicList.isEmpty() == true) {
			throw new EmptyException();
		}
		int count = 0;
		for(int i=0; i<DicList.size(); i++) {
			if(DicList.get(i).getWord().equals(w) == true) {
				DicList.remove(i);
				count++;
			}
		}
		if(count == 0) {
			throw new NotInDicException();
		}
	}
	
	public void printWords() throws EmptyException {
		if(DicList.isEmpty() == true) {
			throw new EmptyException();
		}
		else {
			for(int i=0; i<DicList.size(); i++) {
				int count = i+1;
				System.out.println(count+". "+DicList.get(i).getWord());
			}
		}
	}
	
	public void printAll() throws EmptyException {
		if(DicList.isEmpty() == true) {
			throw new EmptyException();
		}
		else {
			for(int i=0; i<DicList.size(); i++) {
				System.out.println("**************************************");
				System.out.println("Word: "+DicList.get(i).getWord());
				System.out.println("Definition: "+DicList.get(i).getDefinition());
			}
		}
	}
}
