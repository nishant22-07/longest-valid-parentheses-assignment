import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {

    public static int findLongestValid(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }

        Deque<Integer> indices = new ArrayDeque<>();
        indices.push(-1);

        int longest = 0;

        for (int position = 0; position < str.length(); position++) {

            if (str.charAt(position) == '(') {
                indices.push(position);
            } else {

                if (!indices.isEmpty()) {
                    indices.pop();
                }

                if (indices.isEmpty()) {
                    indices.push(position);
                } else {
                    int currentLength = position - indices.peek();

                    if (currentLength > longest) {
                        longest = currentLength;
                    }
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        String[] testCases = {
                "(()",
                ")()())",
                "",
                "()(()",
                "((()))",
                "()()"
        };

        for (String s : testCases) {
            System.out.println("Input : \"" + s + "\"");
            System.out.println("Output: " + findLongestValid(s));
            System.out.println();
        }
    }
}
