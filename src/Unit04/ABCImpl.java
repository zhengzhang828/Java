package Unit04;


public class ABCImpl implements ABC {
	private double balance;
	private String pwd;
	
	public ABCImpl (double balance, String pwd){
		this.balance = balance;
		this.pwd = pwd;
	}
	
	@Override
	public double getBalance(){
		return balance;
	}
	 
	@Override
	public boolean drawMoney(double number){
		
		if((balance - number) >= -2000){
			System.out.println("The input amount is "+number);
			System.out.println("The balance is "+balance);
			balance -= number;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean checkPwd(String input){
		if(pwd.equals(input))
			return true;
		else
			return false;
	}
	
	@Override
	public boolean payTelBill(String phoneNumber, double sum){
		if (phoneNumber.length()<=11 && (balance - sum) >= -2000){
			balance -= sum;
			return true;
		}
		return false;
	}
}
