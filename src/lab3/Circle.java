package lab3;

public class Circle extends Shape {

	int r;
	
	public Circle (int r){
		this.r = r; 
	}
	
	@Override
	public void calculateArea() {
		System.out.println(r*0.5 * Math.PI);
	}

}
