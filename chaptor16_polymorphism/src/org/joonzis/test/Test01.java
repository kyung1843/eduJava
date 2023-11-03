package org.joonzis.test;



class Employee {
	private String name, dept;

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	int pay() {
		return 0;
	}

	void output() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
		System.out.println("월급 : " + pay());
	}
}

class SalaryWorker extends Employee {
	private int salary;

	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}

	@Override
	int pay() {
		return salary;
	}

	@Override
	void output() {
		super.output();
		System.out.println("기본급 : " + salary);
	}

}

class SalesWorker extends SalaryWorker {
	private int salesVolume;
	private double salesIncentive;

	public SalesWorker(String name, String dept, int salary) {
		super(name, dept, salary);
		
		
	}

	@Override
	int pay() {
		return (int)(salesPay() + super.pay());
	}

	

	double salesPay() {
		return super.pay() * salesIncentive;
	}


	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;	
		if(salesVolume> 1000) {
			salesIncentive = 0.1;
		}else if(salesVolume > 500) {
			salesIncentive = 0.05;
		}else {
			salesIncentive = 0.01;
		}
	}


	public void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}
	
	
	@Override
	void output() {
		super.output();
		System.out.println("판매수당 : " + salesPay());
		System.out.println("월급 : " + this.pay());
		
	}
	
}
	
	
	
	
	class PartTimeWorker extends Employee {
		private int workTime;
		private int payPerHour;

		public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
			super(name, dept);
			this.workTime = workTime;
			this.payPerHour = payPerHour;
		}

		@Override
		int pay() {
			return workTime * payPerHour;}

		@Override
		void output() {
			super.output();
			System.out.println("월급 : " + pay());
		}

	}



public class Test01 {
	public static void main(String[] args) {

		Employee[] emp = new Employee[3]; 
		
		emp[0] = new SalaryWorker("김군", "영업", 300);
		emp[1] = new SalesWorker("최군", "영업", 300);
		emp[2] = new PartTimeWorker("박군", "영업", 50, 10000);
		
		for(int i = 0; i < emp.length; i++) {
			emp[i].output();
			for(int j = 0; j < emp.length; j++) {
				if (emp[0] instanceof SalesWorker) {
					SalesWorker sw = (SalesWorker) emp[0];
					sw.salesPay();
				}
			}
			
			
		
		}
		
		
		
		
		
		
		
		
	}
}
