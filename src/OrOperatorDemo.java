
public class OrOperatorDemo {
	public static void main(String args[]){
		System.out.println("OR Operator demo");
		
		int a=1;
		int b=1;
		int c=a|b;
		System.out.println(a+" | "+b+" = "+ c);
		
		 a=1;
		 b=0;
		 c=a|b;
		System.out.println(a+" | "+b+" = "+ c);
		
		 a=0;
		 b=1;
		 c=a|b;
		System.out.println(a+" | "+b+" = "+ c);
		
		 a=0;
		 b=0;
		 c=a|b;
		System.out.println(a+" | "+b+" = "+ c);
		
		 a=2;
		 b=3;
		 c=a|b;
		 System.out.println("Binary value of 2 is 10");
		 System.out.println("Binary value of 3 is 11");
		 //so the output of 10 | 11 is 11 which is 3 lets see the output
		System.out.println(a+" | "+b+" = "+ c);
	}

}
