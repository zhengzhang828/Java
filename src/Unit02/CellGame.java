package Unit02;

import java.util.Scanner;
public class CellGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cell cell = new Cell();
		Scanner sc = new Scanner(System.in);
		cell.col = 6;
		cell.row = 9;	
		while(true){
			System.out.println("The cell location is (" + cell.getCellInfo() + ")");
			printGame(cell);
			System.out.println("1 - drop, 2 - left, 3 - Right, 0 - Exit");
			
			int control = sc.nextInt();
			if (control == 0){
				System.out.print("Game Over");
				break;
			}else{
				switch(control){
				case 1: cell.drop();break;
				case 2: cell.moveLeft();break;
				case 3: cell.moveRight();break;
				}
				
			}
			
		}
			
	}
		
	private static void printGame(Cell cell) {
		// TODO Auto-generated method stub
		int totalRow = 20;
		int totalCol = 10;
		
		for (int i=1; i<=totalRow; i++){
			for (int j=1; j<=totalCol; j++){
				if (cell.col == j && cell.row == i){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		}
	

	

}
