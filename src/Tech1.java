
public class Tech1 {
public static void main(String args[]){
	System.out.println("Tech 1");
	System.out.println("n & n-1");
	int a=8;
	//IF n & n-1 ==0 its the power of 2
//	System.out.println(a & (a-1));
	for(int i=0;i<100;i++){
		System.out.println(i +"--->" + (i & (i-1)));
	}
		
}
}
