package week1.day1;

public class Maths {

	public int add() {
		int a=10, b=10;
		int c=a+b;
		return c ;
	}
	public int mul() {
		int x=10, y=10;
		int z=x*y;
		return z;
		
	}
	public int divide() {
		int d=2, e=4;
        int f=d/e;
		return f;
	}
public static void main(String[] args) {
	Maths obj = new Maths();
	int c=obj.add();
	System.out.println(c);
	
	int z=obj.mul();
	System.out.println(z);
	
	int f=obj.divide();
	System.out.println(f);
}

	
}