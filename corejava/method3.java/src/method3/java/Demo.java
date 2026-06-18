package method3.java;

public class Demo {

	public static void main(String[] args) {
		
			Demo a = new Demo();
			Demo b = new Demo();
			Demo c = new Demo();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			a=null;
			
			System.gc();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			b=c;
			System.out.println(a);
			System.out.println(b);
	}
	


}
