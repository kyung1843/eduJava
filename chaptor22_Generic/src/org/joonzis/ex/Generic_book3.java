package org.joonzis.ex;
interface Rentable<P>{
	P rent();
}
class Home{
	public void trunOnLight() {
		System.out.println("전등을 키다");
	}
}

class Car1{
	public void run() {
		System.out.println("차가 달리다");
	}
}
public class Generic_book3 implements Rentable<Home>{

	@Override
	public Home rent() {
		return new Home();
	}
	
	public static void main(String[] args) {
		Generic_book3 homeAgency = new Generic_book3();
		Home home = homeAgency.rent();
		home.trunOnLight();
		
	}
}
