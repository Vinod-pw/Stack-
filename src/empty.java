import java.util.Stack;

public class empty {
    public static void main (String [] args){
        Stack <Integer> s = new Stack<>();
//        if (s.isEmpty()){
//            System.out.println("stack is empty");
//        }else {
//            System.out.println("stack is not empty");
//        }
        s.push(1);
        if (s.isEmpty()){
            System.out.println("stack is empty");
        }else {
            System.out.println("stack is not empty");
        }
    }
}
