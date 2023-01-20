package Lab2;

import java.util.Stack;

public class Main {
        public static boolean isBalanced(String exp) {

            if (exp == null || exp.length() % 2 == 1) {
                return false;
            }

            Stack<Character> stack = new Stack<>();

            for (char c : exp.toCharArray()) {

                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }

                if (c == ')' || c == '}' || c == ']') {

                    if (stack.empty()) {
                        return false;
                    }

                    Character top = stack.pop();

                    if ((top == '(' && c != ')') || (top == '{' && c != '}')
                            || (top == '[' && c != ']')) {
                        return false;
                    }
                }
            }

            return stack.empty();
        }

    public static void main(String[] args) {
        String exp = "{(}[{}]";

        if (isBalanced(exp)) {
            System.out.println("ОК!");
        }
        else {
            System.out.println("Ошибка!!!");
        }
    }
}
