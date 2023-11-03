package org.joonzis.test;

class Employee{
	
	String name, dept;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	int pay() {
		return 0;      //임시값 설정(추천X)
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " +dept);
	}
	
	
}


class SalaryWorker extends Employee{
	
	int salary;

	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}

	@Override
	int pay() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	void output() {
		super.output();
		System.out.println("급여 : " + pay() );
	}
	
	
}


class SalesWorker extends SalaryWorker{
	
	double salesIncentive;
	
	public SalesWorker(String name, String dept, int salary, double salesIncentive) {
		super(name, dept, salary);
		this.salesIncentive = salesIncentive;
	}



	@Override
	int pay() {
		return salary + salesPay();
	}

	@Override
	void output() {
		super.output();
		System.out.println("판매수당 : " + pay());
	}
	
	
	int salesPay() {
		return (int)(salary * salesIncentive);
	}
	
	
	
	
	
	
	
}

class PartTimeWorker extends Employee{
	
	int workTime, payPerHour;

	public PartTimeWorker(String name, String dept,int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}

	@Override
	int pay() {
		// TODO Auto-generated method stub
		return super.pay();
	}

	@Override
	void output() {
		// TODO Auto-generated method stub
		super.output();
		System.out.println("급여 : " + pay() );
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


public class Test03 {
	public static void main(String[] args) {
		
		SalaryWorker sal = new SalaryWorker("김씨", "영업부", 50);
		sal.output();
		
		
		System.out.println("================================");
		
		PartTimeWorker part = new PartTimeWorker("박씨", "회계부", 50,  10000);
		part.output();
		
		System.out.println("==================================");
		
		SalesWorker sales = new SalesWorker("이씨", "개발부",2000,0.45);
		sales.output();
		
		
		
		
		
		
		
		
	}
}
