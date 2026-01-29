public class SearchInRoratedSortedArray {
    public static int SearchRotated(int [] arr,int target){
        int low = 0; int high = arr.length-1;

      while(low<=high){
        mid = low + (high-low)/2;

        if(arr[mid]==target){
            return mid;
        }
    }
        if(arr[low]<= arr[mid]){
            if(target>=arr[low] && target<arr[mid]){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        else{
            if(atrget>arr[mid] && target <= arr[high]){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return -1;
      }
    public static void main(String[] args) {
        int [] arr ={10,30, 57,54,67,34,11};
        int target =30;
        System.out.println(SearchRotated(arr,target));

    }
}
 