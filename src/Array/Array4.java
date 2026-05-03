package Array;

import java.util.*;


public class Array4 {

    // Two sum
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++){
            for (int j = i + 1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    int[] ans = {i,j};
                    return ans;

                }
            }
        }
        int[] ans = {};
        return ans;
    }

    // Three sum
    static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> Output = new HashSet<>();
        int n = nums.length;
        int target = 0;

        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if (nums[i] + nums[j] + nums[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        Output.add(temp);
                    }
                }
            }
        }
        return new ArrayList(Output);

    }

    // Optimize three sum
    static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }

    // Remove duplicate element
    static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while(j < n){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }

    // First Element With unique frequency
    static int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer, Integer> freqCount = new HashMap<>();
        for (int f : freq.values()) {
            freqCount.put(f, freqCount.getOrDefault(f, 0) + 1);
        }

        for (int num : nums) {
            if (freqCount.get(freq.get(num)) == 1) {
                return num;
            }
        }
        return -1;
    }

    // Find the pivot Element
    static int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = nums[0];
        for (int i = 1; i < n; i++){
            leftSum[i] = leftSum[i-1] + nums[i];
        }

        rightSum[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; i--){
            rightSum[i] = rightSum[i+1] + nums[i];
        }

        for (int i = 0; i < n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }


    static void main() {
        int arr[] = {4,2,5,6,7,8};
        int ans[] = twoSum(arr , 10);
        for (int i : ans){
            System.out.print(i);
        }
    }
}