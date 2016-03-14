package Unit03;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] anynameshape = new Shape[3];
		anynameshape[0] = new Square(4);
		anynameshape[1] = new Circle(4);
		anynameshape[2] = new Polygon(4);
		
		maxArea(anynameshape);
	}
	
	public static void maxArea(Shape[] shapes){
		double max = shapes[0].area();
		System.out.println("The area of the shape 0 is "+max);
		int maxIndex = 0;
		for(int i = 1; i < shapes.length; i++){
			double area = shapes[i].area();
			System.out.println("The area of the shape "+i+" is "+area);
			if (area > max){
				max = area;
				maxIndex = i;
			}
		}
		System.out.println("Index is "+maxIndex+" Area is "+max);
	}

}
