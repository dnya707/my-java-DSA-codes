public class LargestNumber {
    public static int findLargest(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {  
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
      
        int[] arr = {1, 5, 3, 9, 2};

        System.out.println(findLargest(arr));  
    }
  }
