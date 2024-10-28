public class DeleteConsecutiveStrings {
    public static String deleteConsecutiveString(String s){
        // Initialize start ans stop pointer
        int i =0;
        int j = 0;
         // Initialize an empty string for new element
        StringBuilder temp = new StringBuilder();
        // Iterate string using j pointer
        while ((j<s.length())){
            // if both element are same then skip
            if (s.charAt(i) == s.charAt(j)){
                j++;
            }
            //if both element are not same the append temp
            else {
                temp.append(s.charAt(i)) ;
                // after appending , slid over the window
                i=j;
            }
            j++;
        }
        // Append the last String
        temp.append(s.charAt(j-1));
        return temp.toString();
    }
    public static void main(String[] args) {
        String str = "aabbccdeeff";
        String result = deleteConsecutiveString(str);
        System.out.println(result);
    }
}
