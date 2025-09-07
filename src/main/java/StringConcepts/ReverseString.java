package StringConcepts;

public class ReverseString {

    public static void main (String[] args){

        String s= "principal";
        /*String reverseString = " ";
        for( int i=s.length()-1;i>=0;i--){
            reverseString = reverseString + s.charAt(i);
        }
        System.out.print("reverse string is "+reverseString);
        */
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.print("reverse string is "+reversed);


    }

}
