package Unit04;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ABCATM {

	private UnionPay card;

	public void intertCard(UnionPay userCard) {
		if (card == null) {
			card = userCard;
		}
	}

	private void outCard() {
		card = null;
	}

	private void showBalance() {
		System.out.println("The current balance is " + card.getBalance());
	}

	private void takeMoney() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the amount");
		double num = Double.parseDouble(input.next());
		if (card.drawMoney(num)) {
			System.out.println("Withdraw succeed");
		} else {
			System.out.println("Withdraw failed");
		}
	}

	private void payTellBill() {
		Scanner input = new Scanner(System.in);
		if (card instanceof ABC) {
			System.out.println("Please input the phone number");
			String telNum = input.next();
			System.out.println("Please input the amount");
			double num = Double.parseDouble(input.next());
			if (((ABC) card).payTelBill(telNum, num)) {
				System.out.println("Pay successfully");
			} else {
				System.out.println("Pay failed");
			}
		} else {
			System.out.println("Your card is not ABC card, unable to pay");
		}
	}

	public void allMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the password");
		String pwd = input.next();
		if (card.checkPwd(pwd)) {

			while (true) {
				System.out.println(
						"\n Plese select options: \n 1. Check the balance \n 2. Withdraw \n 3. Pay telephone bills \n 0. Return card");
				int choice = Integer.parseInt(input.next());
				if (choice == 0) {
					System.out.println("Return card");
					break;
				} else {

					switch (choice) {
					case 1:
						showBalance();
						break;
					case 2:
						takeMoney();
						break;
					case 3:
						payTellBill();
						break;
					default:
						System.out.println("Error input");
					}
				}
			}
		} else {
			System.out.println("Wrong password");
		}
		this.outCard();

	}

}
