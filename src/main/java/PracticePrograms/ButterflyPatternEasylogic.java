package PracticePrograms;

public class ButterflyPatternEasylogic {

    public static void main(String[] args){
        int n=3;
      for(int i=1;i<=2*n-1;i++){
       int stars = i<=n?i:2*n-i;
       int spaces = i==n?0:(stars==1?3:1); // custom spaces
       for(int j=1;j<=stars;j++){
           System.out.print("*");
       }
       for(int j=1;j<=spaces;j++){
           System.out.print(" ");
        }
       for(int j=1;j<=stars;j++){
           System.out.print("*");
       }
          System.out.println();
        }
    }
}
