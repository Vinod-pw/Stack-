import java.util.Stack;

public class balancedBracket {
    // create a function
    public static boolean BalancedBracket(String expr) {
        // declare a stack to hold thr previous bracket
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            if (temp.empty()) {
                // if the Stack id empty
                //then push the current bracket
                temp.push(expr.charAt(i));
            } else if ((temp.peek() == '(' && expr.charAt(i) == ')')
                    || (temp.peek() == '{' && expr.charAt(i) == '}')
                    || (temp.peek() == '[' && expr.charAt(i) == ']')) {
                // if we found the any complete pair of bracket
                // then pop
                temp.pop();
            } else {
                temp.push(expr.charAt(i));
            }
        }
        return temp.empty();
    }

    public static void main(String[] args) {
        String expr = "{[()]}";
        if (BalancedBracket(expr)){
            System.out.println("Bracket are Balanced ");
        }else{
            System.out.println("bracket are not balanced");
        }
    }
    }

