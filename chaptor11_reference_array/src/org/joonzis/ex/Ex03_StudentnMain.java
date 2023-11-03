package org.joonzis.ex;


public class Ex03_StudentnMain {
	public static void main(String[] args) {
		
		
	Ex03_StudentManager manager = new Ex03_StudentManager();
		
	manager.addNewStudent(manager.input());
	manager.addNewStudent(manager.input());
	manager.addNewStudent(manager.input());
	
	manager.outputAverage();
	
	
	}

	
	
	
	
}
