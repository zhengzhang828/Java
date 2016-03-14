package Unit04;
import java.util.Scanner;

public class TestUnionPay {

	public static void main(String[] args) {
		UnionPay icbc = new ICBCImpl(2000, "123456");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the password");
		if(icbc.checkPwd(input.next())){
			System.out.println("Please input the money");
			double num = Double.parseDouble(input.next());
			if(icbc.drawMoney(num)){
				System.out.println("Withdraw success, the current balance is "+icbc.getBalance());
			}else{
				System.out.println("Withdraw failed");
			}
		}else{
			System.out.println("Wrong Password");
		}
		input.close();
	}
	
}
