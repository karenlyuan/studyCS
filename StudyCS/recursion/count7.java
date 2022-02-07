public class StudentClass{
	public static int count7(int num){
        //enter solution below
        
        int count = 0;
        
        if (num == 0) {
            return 0;
        } else {
            if(num % 10 == 7) {
                count++;
            } else {
                count += 0;
            }
        }
        
        return count + count7(num / 10);
	}
}
