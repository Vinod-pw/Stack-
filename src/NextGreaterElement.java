import java.util.Stack;
public class NextGreaterElement {
    public static void PrintNGE(int []arr , int n){
        Stack <Integer> s = new Stack<>();
        /* push the first element to stack */
        s.push(arr[0]);
        // iterate for rest of the elements
        for(int i =0;i<n; i++){
            if (s.empty()){
                s.push(arr[i]);
                continue;
            }
            /*
             * if stack is not empty, then pop an element from stack. If the popped
             * element is smaller than next, then a) print the pair b) keep popping while
             * elements are smaller and stack is not empty
             */
            while (s.empty()==false && s.peek()< arr[i]) {
                System.out.println(s.pop()+ "---->"+ arr[i]);

            }
            /* push next to stack so that we can find next greater for it */
            s.push(arr[i]);
        }
while (s.empty() == false){
    System.out.println(s.pop()+ "---->"+ -1);
}
    }
    public static void main(String[] args) {
        int [] arr = {5,6,3,10,43,20};
        int n  = arr.length;
         PrintNGE(arr,n);
    }
}
