
// print the indices of the students marks below than 35 !!

import java.util.Arrays;
public class Smarks {
    public static void main (String []args){
     

        int [] arr= {43,21,98,17,67,56,99,87,35,89};
         int n = arr.length;
          for(int i=0; i < n ;i++){
            if(arr[i] < 35)
            System.out.println(arr[i]+" ");
          }
        }
          
}
