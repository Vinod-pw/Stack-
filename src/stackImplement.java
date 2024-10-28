import java.util.Stack;
public class stackImplement {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);
        // INSERT AT INDEx
       int idx =4;
       int x = 34;
       Stack<Integer> temp = new Stack<>();
       while (st.size()>idx){
           temp.push(st.pop());

       }
       st.push(x);
       while(temp.size()>0){
           st.push(temp.pop());

       }
       System.out.println(st);

    }
}
