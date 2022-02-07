public class StudentClass{
	public static boolean has6(int[] nums, int index){
        //enter your solution below - do not use a loop!
        
        if(nums.length <= index) {
            return false;
        } else {
            if(nums[index] == 6) {
                return true;
            } else {
                return has6(nums, index+1);
            }
        }
	}
}
