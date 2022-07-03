package strings;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(char[] str) {
        Stack <Character> stack = new Stack<>();
        for (char c : str) {
            stack.push(c);
        }
        for (int i=0; i < str.length; i++) {
            str[i] = stack.peek();
            stack.pop();
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {

        String name = "Washington";
        name = reverseString(name.toCharArray());
        System.out.println(name);
    }
}
