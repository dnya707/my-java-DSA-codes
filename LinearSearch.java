public class LinearSearch{
    public static int linearSearch(int[]arr,int target){
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
public static void main(String[]args){
    
    int [] arr ={10,20,30,40,50};
     int target = 23;
   
     int result = linearSearch(arr, target);

     if(result != -1){
        System.out.println("Element found at index:"+result);
     }else{
        System.out.println("ELement not found !");
     }
 }

}
