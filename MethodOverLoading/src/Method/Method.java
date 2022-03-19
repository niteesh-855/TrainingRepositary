package Method;

public class Method {
	public int addition(int a ,int b ) {
	    return a+b;
	}
	public int addition (int a, int b ,int c) {
		return a+b+c;
	}
	public void addition(float a ,int b) {
		System.out.println(a+b);
	}
	public void addition(int a ,float b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Method m1=new Method();
		System.out.println(m1.addition(10, 10));
	System.out.println(	m1.addition(10 , 10, 10));
		m1.addition(3.2F, 5);
		m1.addition(8, 2.5F);
       System.out.println("========method overloading=========");
	}

}
