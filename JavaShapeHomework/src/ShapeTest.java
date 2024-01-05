
public class ShapeTest {
	public static void main(String[] args)
	{
		Triangle Tr1= new Triangle(5,6);
		Square Sq1 = new Square(7);
		Circle Ci1  = new Circle(1);
		Cube Cu1 = new Cube(2);
		Sphere Sp1 = new Sphere(3);
		Tetrahedron Th1 = new Tetrahedron(4);
		
		
		Tr1.getInfo();
		System.out.println("-----------------------------------------");
		Sq1.getInfo();
		System.out.println("-----------------------------------------");
		Ci1.getInfo();
		System.out.println("-----------------------------------------");
		Cu1.getInfo();
		System.out.println("-----------------------------------------");
		Sp1.getInfo();
		System.out.println("-----------------------------------------");
		Th1.getInfo();
		
		
	}

}