public class LastOccurrenceBinarySearch {
    public static int lastOccurrence(int[] arr, int target){
        int n = arr.length;
        int low =0;
        int high =n-1;
        int result = -1;

      while(low<= high){
       int mid =low+(high-low)/2;
        
        if(arr[mid]==target){
            result = mid;
           low=mid+1;
        }else if (arr[mid]<target){
          high= mid-1;
         }else{
           low=mid+1;
         }
            
        }
      
      return result;
    }
    public static void main(String[]args){
        int[]arr = {1,2,2,3,4,2,5};
        int target =2;                       //index=7

            int index = lastOccurrence(arr,target);

            if(index != -1){
                System.out.println("last occurrence of " +target  + " is at on index:" +index);
            }else{
                System.out.println("Element not found !!");
            }
 
        }
    }

