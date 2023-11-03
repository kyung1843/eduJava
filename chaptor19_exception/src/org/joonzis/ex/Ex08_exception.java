package org.joonzis.ex;

//예외 클래스 : Excetpion을 상속받아서 만든다(Custom Exception)

class MyException extends Exception{

	/*예외 클래스 만드는 이유 : 사용자 친화적인 예외 메세지로 변경 가능, 
	 * 예외가 아닌 것도 예외로 만들 수 있다
	 */
	//경고 없애려고 넣은거니까 신경쓰지 말자
	private static final long serialVersionUID = 1L;
	
	public MyException(String msg) {
//		super(message) == Exception(message)  -->
//		throwable(String message){detailMessage = message;}
		super(msg);
	}
}

public class Ex08_exception {
	public static void main(String[] args) {
		try {
			throw new MyException("내가 만든 예외!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
