public class StudentClass{
	public static String noX(String str){
        //enter your solution below
        
        if(str.length() <= 0) {
            return str;
        } else {
            if(str.substring(0,1).equals("x")) {
                return noX(str.substring(1));
            } else {
                return str.substring(0,1) + noX(str.substring(1));
            }
        }
        
	}
}
