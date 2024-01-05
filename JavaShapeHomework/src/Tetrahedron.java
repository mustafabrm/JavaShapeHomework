
public class Tetrahedron extends ThreeDimensionalShape {
   private double a;
   
	
	public Tetrahedron(double a) {
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
		return Math.sqrt(3)*a*a;
	}

	
	public double hacimBul() {
		return Math.sqrt(2)/12*a*a*a;
	}

	@Override
		public void getInfo() {
			// TODO Auto-generated method stub
			super.getInfo();
			System.out.println("bir düzgün dörtyüzlüyüm \nalanım:"+alanBul()+"\nhacmim: "+ hacimBul());
 }
}