package Unit02;

public class Cell {

	int col;
	int row;
	
	public void drop(int t){
		row += t;
	}
	
	public void drop(){
		row += 1;
	}
	
	public void moveLeft (int t) {
		col -= t;
	}
	
	public void moveLeft(){
		col -= 1;
	}
	
	public void moveRight (int t) {
		col += t;
	}
	
	public void moveRight(){
		col += 1;
	}
	
	public String getCellInfo () {
		return col + "," + row;
	}
	
}
