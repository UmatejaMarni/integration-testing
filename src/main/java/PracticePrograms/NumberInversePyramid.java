package PracticePrograms;

public class NumberInversePyramid {

    public static void main (String[] args){

       int num=1;
       int rows = 4;
      // int columns = 4;

       for(int i=0;i<rows;i++){

           for (int j=0;j<rows-i;j++){

               System.out.print(num++ + " ");
           }

           System.out.println();
          // columns=columns-1;


       }



    }





}



