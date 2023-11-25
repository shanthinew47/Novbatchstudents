package first;

public class assignment2 {
	public int mult(int a,int b) {
		int multi;
		multi=a*b;
		System.out.println("mult is " +multi);
		return multi;
		
		
	}

	public int sub(int c,int d)
	{
		int subt;
		subt=c-d;
		System.out.println("subtraction is " +subt);
		return subt;
		
	}
	public int sum(int e,int f) {
		int sum;
		sum=e+f;
		System.out.println("sum " +sum);
		return sum;
		
	}
	public int div(int g,int h) {
		int div;
		div=g/h;
		System.out.println("division " +div);
		return div;
	}
	public static void main(String[] args) {
		assignment2 AE=new assignment2();
		int multiply=AE.mult(10, 2);
		int substract=AE.sub(multiply, 2);
		int add=AE.sum(substract, 2);
		int subtwice=AE.sub(add, 2);
		int div=AE.div(subtwice, 2);
		System.out.println("division div is" +div);
		
	}
	
}
