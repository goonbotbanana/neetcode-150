import java.util.Arrays;
import java.util.HashMap;

public class NC_242 {
    public static void main(String[] args) {
        NC_242 nc = new NC_242();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(nc.isAnagram(s, t));
    }
    /* O(nlogn) */
    // public boolean isAnagram(String s, String t) {
    //     char[] s_arr = s.toCharArray();
    //     char[] t_arr = t.toCharArray();

    //     Arrays.sort(s_arr);
    //     System.out.println("s string sorted: " +Arrays.toString(s_arr));
    //     Arrays.sort(t_arr);
    //     System.out.println("t string sorted: " +Arrays.toString(t_arr));

    //     // return s_arr == t_arr; this is incorrect since it compares their hashCodes
    //     return Arrays.equals(t_arr, s_arr);
    // }

    /* O(n) */
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        //count freq. of characters in string s
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); //defaults to zero if c is not in the hashmap. If it IS in the hashmap, then increment the value by one.
            // System.out.println(map);
        }

        //decrement freq. of characters in string t from map
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1); //defaults to zero if c is not in the hashmap. If it IS in the hashmap, then decrement the value by one.
            // System.out.println(map);
        }

        //check if any character has non-zero frequency in the map
        for(int val : map.values()) {
            if (val != 0) return false;
        }

        return true;
    }
}
