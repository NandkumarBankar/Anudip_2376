package example.sevice;

public class service {
	int n=12;
	
	int calculateSum() {
		int sum;
		sum= (n*(n+1))/2;
		return sum;
	}
	
	

	public static void main(String[] args) {
	service adobj=new service();
		int newad=adobj.calculateSum();
		System.out.println("Sum of First Nat Number = " +newad);
		
		
		{
			int n=12;
			
				 int s1=((n/3))*(2*3+(n/3-1)*3)/2; //n%3 -sum of n number which is div by 3
				 int s2=((n/5))*(2*5+(n/5-1)*5)/2; //n%5 -sum of n number which is div by 5
				 int tot=s1+s2;
				 
				 System.out.println("Sum of Natural no which is Div by 3 & 5  = " + tot);
			 }
			
		}
	}	
	
