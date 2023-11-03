package org.joonzis.test;
//interface Providable		메소드: sightseeing(), leisure(), food()
//class KoreaTour				메소드 : Providable 구현을 통해생성
//class GuamTour				메소드 : Providable 구현을 통해생성
//class TourGuide				필드 : Providable tour
//							메소드 : Constructor, sightseeing(), leisure(), food()
//★ KoreaTour / GuamTour -  Providable 구현
interface Providable{
	public void sightseeing();
	public void leisure();
	public void food();
}

class TourGuide{
	Providable tour;
	
	public TourGuide(Providable tour) {
		this.tour = tour;
		
	}


	
	public void sightseeing() {
		tour.sightseeing();
	}

	public void leisure() {
		tour.leisure();
	}

	public void food() {
		tour.food();
	}
	
}
class KoreaTour implements Providable{

	@Override
	public void sightseeing() {
		System.out.println("한국 관광");
	}

	@Override
	public void leisure() {
		System.out.println("집라인");
	}

	@Override
	public void food() {
		System.out.println("떡볶이"); 
	}
	
}

class GuamTour implements Providable{



	@Override
	public void sightseeing() {
		System.out.println("괌 관광");
	}

	@Override
	public void leisure() {
		System.out.println("스노쿨링");
	}

	@Override
	public void food() {
		System.out.println("로꼬모꼬");
	}
	
	
}










public class Test02 {
	public static void main(String[] args) {
		
		TourGuide guide = new TourGuide(new KoreaTour());
		guide.sightseeing();
		guide.leisure();
		guide.food();
		
		
		
	}
}
