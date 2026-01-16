class Solution {
    public int removeDuplicates(int[] nums){

        // int n=nums.length;

        int i=0;
        for(int j = 1; j< nums.length; j++){

            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
public class removeDuplics{
    public static void main(String[]args){

    int [] arr ={1,1,2,2,3};
    Solution s = new Solution();
    int dnya =s.removeDuplicates(arr);

    System.out.println(dnya);
 }
}
