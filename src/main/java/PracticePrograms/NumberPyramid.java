package PracticePrograms;
public class NumberPyramid {
    public static void main(String[] args) {
    int num = 1;
    int rows = 4;
    //int columns = 1;
    for(int i = 0;i<rows;i++)
    {
        for (int j = 0; j <=i; j++) {
            System.out.print(num++ + " ");
        }
       // columns = columns + 1;
        System.out.println();
    }
    }
}
