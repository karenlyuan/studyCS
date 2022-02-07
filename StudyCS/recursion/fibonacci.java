public class StudentClass{

	public static int fibonacci(int n){
		//this problem has at least 2 base cases
		
		if(n==0) {
		    return 0;
		    
		}
		if(n==1) {
		    return 1;
		}
		else {
		    return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}

}
