package Unit03;

public class Square extends Shape {
	//private double c;
	
	public Square(double c){
		this.c = c;
	}
	
	public double area(){
		return 0.0625*c*c;
	}
	
}
