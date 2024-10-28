import java.util.Stack;

public class copyOfStack {
    public static void main(String[] args) {
        // STEP 1 :
        Stack <Integer> original= new Stack<>();
        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);
        original.push(40);
        original.push(50);
        System.out.println("original Stack is => "+ original);
        Stack<Integer> reverse = new Stack<>();
        while (!original.isEmpty()){
            reverse.push(original.pop());
        }
        System.out.println("reverse Stack is => "+ reverse);
        // STEP 3 : COPY OF STACK;
        Stack<Integer> copy = new Stack<>();
        while (!reverse.isEmpty()){
            copy.push(reverse.pop());
        }
        System.out.println("Copy of Stack is =>" + copy);
    }
}
