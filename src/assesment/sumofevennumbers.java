package assesment;

public class sumofevennumbers {

	public static void main(String[] args) {
		int esum=0;
		int x=1;
		while(x<=20) {
			if(x%2==0) {
				esum=esum+x;
			
			}
			x=x+1;
					
			}
		System.out.println("sum of even"+esum);
		
	}

}
