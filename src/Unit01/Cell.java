package Unit01;

public class Cell {

	int col;
	int row;
	
	public void drop(int t){
		row += t;
	}
	
	public void moveLeft (int t) {
		col -= t;
	}
	
	public void moveRight (int t) {
		col += t;
	}
	
	public String getCellInfo () {
		return col + "," + row;
	}
	
}
