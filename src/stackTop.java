import java.util.Stack;

public class stackTop {
    static int topElement(Stack<Integer> s){
    return s.peek();
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        System.out.println(topElement(s));
        s.push(2);
        System.out.println(topElement(s));
        s.push(3);
        System.out.println(topElement(s));
    }
}
