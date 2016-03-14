package Unit03;

public class Circle extends Shape {
	//private double c;
	public Circle(double c){
		this.c = c;
	}
	
	public double area(){
		return 0.0796*c*c;
	}
}
