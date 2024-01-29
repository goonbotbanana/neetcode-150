import java.util.Arrays;

public class NC_217 {
    public static void main (String[] args) {
        NC_217 nc = new NC_217();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(nc.containsDuplicate(nums));
    }
    /* O(nlogn) */
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     System.out.println("Sorted array: " +Arrays.toString(nums));
       
    //     for (int i = 0; i < nums.length-1; i++) { //nums.length-1 ensures that I don't index beyond the last item in line 14
    //         if (nums[i] == nums[i+1]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public boolean containsDuplicate(int[] nums) {
        

        
        return false;
    }

    
}
