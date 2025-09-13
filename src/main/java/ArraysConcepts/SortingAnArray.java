package ArraysConcepts;

public class SortingAnArray {
    public static void main(String[] args){
        int a[]= {2,6,1,4,9};
/*for (int i=0;i<a.length-1;i++){
       if(a[i]>a[i+1]){
           int  temp = a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
        i=-1;
    }*/
        for ( int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++)
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;


                }




        }
       /* for (int K : a){
            System.out.print(K);
}*/

        for ( int k=0;k<a.length;k++)
        {
            System.out.print(a[k]);
        }


    }


}
