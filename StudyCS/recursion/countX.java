public class StudentClass{
	public static int countX(String str){
        //enter your solution below
        
        
        if(str.length() <= 0) {
            return 0;
        } else {
            String oneChar = str.substring(0,1);
            if(oneChar.equals("x")) {
                return 1+countX(str.substring(1));
            } else {
                return countX(str.substring(1));
            }
        }
        
	}
}
