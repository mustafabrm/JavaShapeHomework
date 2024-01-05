
public class Square extends TwoDimensionalShape{

  private double a;
  
	public Square(double a) {
	super();
	setA(a);
}

	public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a>0?a:0;
}

	public double alanBul() {
		return a*a;
	}
	
		@Override
			public void getInfo() {
				// TODO Auto-generated method stub
			System.out.println("ben kareyim, iki boyutluyum ve alanım: "+alanBul());	
			}
}