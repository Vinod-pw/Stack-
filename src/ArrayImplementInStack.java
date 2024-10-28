import java.util.Stack;
public class  ArrayImplementInStack{
    public static class Stack{
        private int[]arr = new int [5];
        private int idx = 0;

        void push(int x){
        if(isfull())
        {
            System.out.println("Stack is full");
            return;
        }
        arr[idx]= x;
        idx++;
        }
        int peek(){
            if (idx==0){
                System.out.println("the Stack is empty");
                return-1;
            }
            return arr[idx-1];
        }
        int pop(int x){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top= arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for (int i =0;i<=idx-1;i++){
                System.out.println(arr[i]);
            }
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isfull(){
            if (arr.length==idx)
                return true;
            return false;
        }
    }
    public static  void main(String[] args){
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
       st.push(70);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop(1));
        System.out.println(st.size());
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isfull());

    }
}
