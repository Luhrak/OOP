package lab3;

public class Recktangle extends Shape {

	int a;
	int b;
	
	public Recktangle (int a, int b){
		this.a = a; 
		this.b = b; 
	}
	
	@Override
	public void calculateArea() {
		System.out.println(a*b);
		
	}

}
