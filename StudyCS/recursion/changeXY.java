public class StudentClass{
	public static String changeXY(String str){
        //enter your solution below. do not use a loop!
        
        if(str.length() <= 0) {
            return str;
        } else {
            if(str.substring(0,1).equals("x")) {
                return "y" + changeXY(str.substring(1));
            } else {
                return str.substring(0,1) + changeXY(str.substring(1));
            }
        }


	}
}
