
public class Funca {

	public class Func_a {

		public static void main(String[] args) {
			int a=10;
			int b=myFunc(a);
			System.out.println(b);
		}
		public static int myFunc(int a) {
			return a*3;
		}

	}

	public class Func_b {

	    public static void main(String[] args) {
	        int a = 10;
	        myFunc(a);
	    }
	    public static void myFunc(int a) {
	        int b;
	        b = a*3;
	        System.out.println(b);
	    }
	 }
}
	
