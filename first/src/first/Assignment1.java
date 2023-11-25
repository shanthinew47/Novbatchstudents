package first;



public class Assignment1 {
	//((((10+2)+2)-2)*2)/2)
	
		public int sum(int a,int b) 
		{
			int z;
			z=a+b;
			
			System.out.println("sum result is" +z);
			return z;
		
		}
		public int sub(int c, int d)
		{
			int y;
			y=c-d;
			System.out.println("sub result is" +y);
			return y;
					
		}
		public int mult(int f, int g)
		{
			int h;
			h=f*g;
			System.out.println("sub result is" +h);
			return h;
		}
		public int div(int i, int j)
		{
			int k;
			k=i/j;
			System.out.println("sub result is" +k);
			return k;
		}
		public static void main(String Args[])
				{
			Assignment1 AE=new Assignment1();
			int sumation=AE.sum(10,2);
			int doublesum=AE.sum(sumation, 2);
			int substract=AE.sub(doublesum, 2);
			int multiply=AE.mult(substract, 2);
			int divi=AE.div(multiply, 2);
			System.out.println("divi value is " +divi);
			
				}


	}


