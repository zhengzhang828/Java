package Unit03;

import java.awt.geom.Area;

public class Polygon extends Shape {
	public Polygon(double c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	public double area() {
		return 0.0721*c*c;
	}
}
