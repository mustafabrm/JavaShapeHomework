
public class Sphere extends ThreeDimensionalShape{
     private double yaricap;
	@Override
	public double alanBul() {

		return 4*Math.PI*yaricap*yaricap;
	}

	public Sphere(double yaricap) {
		super();
       setYaricap(yaricap);
	}

	

	
	public double getYaricap() {
		return yaricap;
	}

	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}

	public double hacimBul() {
		return (4/3)*Math.PI*yaricap*yaricap*yaricap;
	}
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		System.out.println("bir küreyim \nalanım: "+alanBul()+"\nhacmim: "+hacimBul());
	}

	

}