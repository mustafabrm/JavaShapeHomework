
public class Triangle extends TwoDimensionalShape {
      private double a,h; 
	
	public double alanBul() {
		return getA()*getH()/2 ;
	}

	public Triangle(double a, double h) {
		super();
	    setH(h);
     	setA(a);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a>0?a:0;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h>0?h:0;
	}
  
    @Override
    public void getInfo() {
    	// TODO Auto-generated method stub
    	System.out.println("ben üçgenim, iki boyutluyum ve alanım: "+alanBul());
    }
}