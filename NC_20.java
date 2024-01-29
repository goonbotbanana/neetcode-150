import java.util.Stack;

class NC_20 {
    public static void main(String[] args) {
        NC_20 nc = new NC_20();
        String s = "()";
        System.out.println(nc.isValid(s));
    }

    public boolean isValid(String s) {
        Stack<Character> leftSymbols = new Stack<>();

        for (char c: s.toCharArray()) {

            //left symbol encountered, push to stack
            if(c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
                System.out.println(leftSymbols);
            } else if (c == ')' && (!(leftSymbols.isEmpty())) && ((leftSymbols.peek() == '('))) {
                leftSymbols.pop();
            } else if (c == '}' && (!(leftSymbols.isEmpty())) && ((leftSymbols.peek() == '{'))) {
                leftSymbols.pop();
            } else if (c == ']' && (!(leftSymbols.isEmpty())) && ((leftSymbols.peek() == '['))) {
                leftSymbols.pop();
            } else { //if no valid symbols are encountered
                return false;
            }
        } //end of loop through String s
        return leftSymbols.isEmpty();
    }
}