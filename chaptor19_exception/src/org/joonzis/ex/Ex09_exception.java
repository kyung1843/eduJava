package org.joonzis.ex;
/*DepositException :  마이너스 입금 처리 , 예외 코드 1000
 *WithdrawException : 잔액초과 출금 처리, 예외 코드 2000
 *                     마이너스 출금 처리, 예외 코드 2001*/
class BankAccount{
	//필드
	private String no;      //계좌번호
	private long balance;   //계좌 잔액
	//생성자
	public BankAccount(String no, long balance) {
		this.no = no;
		this.balance = balance;
	}
	
	//메소드
	//1.입금
	public void deposit(long money)throws DepositException {
		if(money < 0) {
			throw new DepositException(1000, "0보다 작으면 입금 불가");
		} 
		balance += money;
	}
	//2.출금
	public void withdraw(long money) throws WithdrawException{
		if(money >balance) {
			throw new WithdrawException(2000, "잔액보다 크면 출금 불가");
		}else if(money <0) {
			throw new WithdrawException(2001, "0보다 작으면 출금 불가");
		}
		balance-=money;
	}
	
	//3.조회
	public void inquire() {
		System.out.println("계좌번호 : + " + no);
		System.out.println(" 잔액 : " + balance);
	}
	//4.이체
	public void transfer(BankAccount account, long money) 
		throws DepositException, WithdrawException{
			withdraw(money);
			account.deposit(money);
		}
	}
	


class DepositException extends Exception{
	private static final long serialVersionisonUID = 1L;
	private int errCode;
	public DepositException(int errCode, String msg) {
		super(msg);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
	}
	


class WithdrawException extends Exception{
	private static final long serialversiontUID = 1L;
	
	private int errCode;
	public WithdrawException(int errCode, String msg) {
		super(msg);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
	}
	


public class Ex09_exception {
	public static void main(String[] args) {
		//계좌 생성
		BankAccount person1 = new BankAccount("123-456", 1000);
		BankAccount person2 = new BankAccount("456-789", 0);
		try {
			person1.deposit(10000);
			person1.inquire();
//			person1.deposit(-200);
			person1.withdraw(5000);
			person1.inquire();
			person1.transfer(person2, 5000);
			person1.inquire();
			
			person2.inquire();
			
		} catch (DepositException e) {
			System.out.println("DepositException 에러메세지 : " + e.getMessage() + "(코드 : "+ e.getErrCode() + ")");
			
		}catch (WithdrawException e) {
			System.out.println("withdrawException 에러 메세지 : " + e.getMessage() + "(코드 : " + e.getErrCode() + ")");
		}
		
		
	}
}
