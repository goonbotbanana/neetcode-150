
class NC_704 {
    public static void main (String[] args) {
    NC_704 nc = new NC_704();
    int[] nums = {-1,0,3,5,9,12};
    int target = 5; //this is the value, not the index
    System.out.println(nc.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int indexLow = 0; //first run results in 0
        int indexHigh = nums.length-1; //first run results in 5

        while (indexLow <= indexHigh) {
            int indexMid = (indexLow + indexHigh) / 2; // Fix: Correct calculation of indexMid
            System.out.println("mid is currently: " +indexMid);
            
            //check if key is equal to mid
            if (target == nums[indexMid]) {
                return indexMid;
            }
            //check if key is greater than mid
            //if key>mid, shift scope to right
            else if (target > nums[indexMid]) {
                indexLow = indexMid + 1;
                System.out.println("low is now: " +indexLow);
                //indexHigh stays the same
                //indexMid will be updated on line 16
            }
            //check if key is less than mid
            //if key<mid, shift scope to left
            else if (target < nums[indexMid]) {
                indexHigh = indexMid -1;
                System.out.println("high is now: " +indexHigh);
            }

        } //end of while loop

        //the target is not present in the array
        return -1;
    } //end of search method
}