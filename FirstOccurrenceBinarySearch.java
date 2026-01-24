public class FirstOccurrenceBinarySearch {
    public static int firstOccurrence(int[] arr, int target){
        int n = arr.length;
        int low =0;
        int high =n-1;
        int result = -1;
      while(low<= high){
       int mid =low+(high-low)/2;
        
        if(arr[mid]==target){
            result = mid;
            high=mid-1;
        }else if (arr[mid]<target){
            low=mid+1;
         }else{
            high=mid-1;
         }
            
        }
      
      return result;
    }
    public static void main(String[]args){
        int[]arr = {1,4,4,5,6,1,2,2,3,4,5};
        int target =2;

            int index = firstOccurrence(arr,target);

            if(index != -1){
                System.out.println("First occurrence of " +target  + " is at on index:" +index);
            }else{
                System.out.println("Element not found !!");
            }
 
        }
    }
