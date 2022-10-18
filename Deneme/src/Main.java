
public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.getArea()+ " " + circle.getRadius());
		
		Circle circle2 = new Circle(3.0 );
		System.out.println(circle2.getArea() + " " + circle2.getRadius() + " " +circle2.getColor());

	}

}
