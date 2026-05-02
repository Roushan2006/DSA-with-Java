package Array;
public class Array3{

    // Sort an Array of 0s and 1s
    // input array    arr = [0,1,1,0,1,0]
    // output array [0,0,0,1,1,1]
    static int[] sort0sand1s(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            if (arr[i] == 1 & arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] == 0){
                i++;
            }
            if (arr[j] == 1){
                j--;
            }
        }
        return arr;
    }



    // Missing Number
    // input array arr = [0,1,3]
    // output 2
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = 0;
        int sum2 = 0;
        for (int i : nums){
            sum1 += i;
        }
        for (int i = 1; i<= n; i++){
            sum2 += i;
        }
        return sum2 - sum1;
    }

    // Find the Unique Element of array
    // input array arr = [2,3,4,3,4,5,2]
    // Output 5
    static int uniqueElement(int[] arr){
        int sum = 0;
        for (int n : arr){
            sum = sum ^ n;
        }
        return sum;
    }



    static void main() {
        int arr[] = {0,1,0,1,0,1};
        int ans[] = sort0sand1s(arr);
        for (int i : ans){
            System.out.print(i + " ");
        }
        System.out.println();
        int arr2[] = {3,0,1};
        System.out.println(missingNumber(arr2));

        int arr3[] = {2,3,4,3,4,5,2};
        System.out.println(uniqueElement(arr3));
    }
}
