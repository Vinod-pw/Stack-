import java.util.Stack;

public class insertAtBottom {
    public static  void insertBottomStack(Stack<Integer> s , int n){
        Stack <Integer> temp= new Stack<>();
        while (!s.isEmpty()){
            temp.push(s.peek());
            s.pop();
        }
        s.push(n);
        while (!temp.isEmpty()){
            s.push(temp.peek());
            temp.pop();
        }
        while (!s.isEmpty()){
            System.out.print(" " + s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack <Integer> original = new Stack<>();
        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);
        original.push(40);
        original.push(50);
        int n = 80;
        insertBottomStack(original , n);
        //System.out.println("original Stack is => "+ original);
        // Insert At bottom / last/ end
       // int ele = 60;
      //  int pos = 2;
      //  Stack<Integer> reverse = new Stack<>();

      //  while (original.size()>= pos){
        //    reverse.push(original.pop());
       // }
        // posotion is original stack is empty , so we push new element at the position
       // original.push(ele);
       // while(reverse.size()>0){
        //    original.push(reverse.pop());
    //    }
     //   System.out.println("insert  Stack is => "+ original);

    }
}
