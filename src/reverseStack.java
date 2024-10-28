import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        while (!original.isEmpty()){
            System.out.print("original Stack is=> ");
            System.out.println(original);
            break;
        }
        Stack<Integer> reverse = new Stack<>();
        while (!original.isEmpty()){
            reverse.push(original.pop());

        }
        System.out.print("Reverse Stack is => ");
        System.out.println(reverse);
    }
}
