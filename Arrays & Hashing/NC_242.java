import java.util.Arrays;

public class NC_242 {
    public static void main(String[] args) {
        NC_242 nc = new NC_242();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(nc.isAnagram(s, t));
    }
    /* O(nlogn) */
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        Arrays.sort(s_arr);
        System.out.println("s string sorted: " +Arrays.toString(s_arr));
        Arrays.sort(t_arr);
        System.out.println("t string sorted: " +Arrays.toString(t_arr));

        // return s_arr == t_arr; this is incorrect since it compares their hashCodes
        return Arrays.equals(t_arr, s_arr);
    }
}
