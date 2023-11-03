package org.joonzis.test;

public class Q3_Day {

	private String schedule;
	
	
	
//	- 필드 : String schedule
//	- 메소드 : Constructor, getSchedule() : 스케쥴반환,
//			setSchedule(String schedule) : 스케쥴 저장, output()
	
	
	public Q3_Day() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getSchedule() {
		return schedule;
	}



	public void setSchedule(String schedule) {       
		this.schedule = schedule;
	}



	void output() {      
		//가지고 있는게 schedule밖에 없으므로 보류
		
		if(schedule == null) {
			System.out.println("없음");
		}else {System.out.println(schedule);
			
		}
	}
	
	
	
	
	
	
	
}
