public class Circle extends TwoDimensionalShape {

	private double yaricap;

	public Circle(double yaricap) {
		super();
		setYaricap(yaricap);
	}

	

	public double alanBul() {
		return Math.PI*yaricap*yaricap;
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("ben çemberim, iki boyutluyum ve alanım: "+alanBul());
	}



	public double getYaricap() {
		return yaricap;
	}



	public void setYaricap(double yaricap) {
		this.yaricap = yaricap>0?yaricap:0;
	}

}