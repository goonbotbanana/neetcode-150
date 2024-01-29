import java.util.Arrays;
import java.util.HashMap;

public class NC_1 {
    public static void main(String[] args) {
        NC_1 nc = new NC_1();
        int[] nums = {5, 2, 3, 4, 5};
        int target = 7;
        System.out.println(Arrays.toString(nc.twoSum(nums, target)));
    }
    /* O(n ) */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            //complement = the number which can be added to the number you're currently at to equal the target
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
             int[] sol = {i, map.get(complement)}; //.get returns the value of the key which is 'complement'
             return sol;
            }
            map.put(nums[i], i); //store the number at index i as the key, and store the index as the value
        }
        //if no sol is found
        int[] sol = {};
        return sol;
    }
}
