
public class Cube extends ThreeDimensionalShape{
   
	 private double a;
	
	
	public double alanBul() {
		return  6*a*a;
	}

	
	
	public double hacimBul() {
		
		return a*a*a;
	}



	public double getA() {
		return a;
	}



	public void setA(double a) {
		this.a = a>0?a:0;
	}



	public Cube(double a) {
		super();
		setA(a);	}

    @Override
    public void getInfo() {
    	// TODO Auto-generated method stub
    	super.getInfo();
    	System.out.println("bir küpüm \nalanım: "+alanBul()+" \nhacmim: "+hacimBul());
    }
}