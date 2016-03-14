package Unit04;

public class TestATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCATM atm = new ABCATM();
		ABCImpl abc = new ABCImpl(3000, "123456");
		atm.intertCard(abc);
		atm.allMenu();
	}

} 
