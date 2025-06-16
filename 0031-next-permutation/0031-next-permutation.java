

class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2,j=0;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0)
        {
             j=n-1;
            while( nums[j]<= nums[i]) j--;
            System.out.println(i+" "+j);
           
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
             j=n-1;
            
    }
    i=i+1;
    j=n-1;
    System.out.println(i+" "+j);
    while(i<j)
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                --j;
            }
        
    }
}



// class Solution {
//     public void nextPermutation(int[] nums) {
//         int n = nums.length;
//         int i = n - 2;

//         // Step 1: Find the first decreasing element from the right
//         while (i >= 0 && nums[i] >= nums[i + 1]) {
//             i--;
//         }

//         // Step 2: If such an element was found
//         if (i >= 0) {
//             int j = n - 1;

//             // Find the element just larger than nums[i] to the right
//             while (nums[j] <= nums[i]) {
//                 j--;
//             }

//             // Step 3: Swap the elements
//             swap(nums, i, j);
//         }

//         // Step 4: Reverse the remaining right part
//         reverse(nums, i + 1, n - 1);
//     }

//     // Helper function to swap elements
//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     // Helper function to reverse a subarray
//     private void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             swap(nums, start, end);
//             start++;
//             end--;
//         }
//     }
// }
