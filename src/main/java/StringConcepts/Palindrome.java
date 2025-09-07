package StringConcepts;

public class Palindrome {
    public static void main (String[] args){
        String s= "test";
      /*  String reverse = "";
        for(int i=s.length()-1;i>=0;i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println("reverse string is "+reverse);
        if(s.equals(reverse))
            System.out.print("string is a palindrome");
        else
            System.out.print("String is not a palindrome");*/
        boolean palindrome = true;
        for(int i=0;i<s.length()/2;i++) {
            if (s.charAt(i)!= s.charAt(s.length()-1-i)){
                palindrome = false;
                break;

            }
        }
        if(palindrome)
            System.out.println("string is a palindrome");
        else
            System.out.println("string is not a palindrome");
    }
}
