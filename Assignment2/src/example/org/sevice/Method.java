package example.org.sevice;

public class Method {
int n=10;
	
	int calculateDifference() {
		int sum;
		int sum1,sum2,sum3;
		sum1= (n*(n+1)*((2*n)+1))/6; //Sum of the SQ. of the first N Natural NO.
		sum3= (n*(n+1))/2;    //Sum of N natural Number
		sum2=sum3*sum3;         //Square of (Sum of N natural Number)
		sum=sum2-sum1;    //Differance bet Sum1 & sum2

		return sum;
	}
	
	public static void main(String[] args) {
		Method adobj=new Method();
		int newadd=adobj.calculateDifference();
		System.out.println( newadd);

		
	}
}
