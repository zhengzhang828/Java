package Unit04;
import java.util.Scanner;

public class TestUnionPay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.gc();
		UnionPay abc = new ABCImpl(2000, "123456");
		Scanner input = new Scanner(System.in);
		System.out.println("The current balance is "+abc.getBalance());
		System.out.println("Please input the password");
		if(abc.checkPwd(input.next())){
			System.out.println("Please input the amount withdraw");
			double num = Double.parseDouble(input.next());
			System.out.println("The input amount is "+num);
			System.out.println("drawMoney function results "+abc.drawMoney(num));
			if(abc.drawMoney(num)){
				System.out.println("Withdraw success, the current balance is "+abc.getBalance());
			}else{
				System.out.println("Withdraw failed");
			}
		}
		else{
			System.out.println("Wrong password");
		}
		input.close();
	}

}
