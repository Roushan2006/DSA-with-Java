package Array;

import java.util.HashMap;

public class Array2 {

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++){
            rev[i] = arr[n-1-i];
        }
        return rev;
    }


    static int[] shiftByOne(int[] arr){
        int n = arr.length;
        int shiftArray[] = new int[n];
        for (int i = 0; i < n; i++){
            if ( i == n-1){
                shiftArray[0] = arr[n-1];
            }
            else{
                shiftArray[i + 1] = arr[i];
            }
        }
        return shiftArray;
    }


    static int[] extreamAlternative(int[] arr){
        int n = arr.length;
        int arr1[] = new int[n];
        int i = 0;
        int j = n-1;
        for (int k = 0; k < n; k += 2){
            if( i <= j){
                arr1[k] = arr[i++];
                if (k + 1 < n){
                    arr1[k + 1] = arr[j--];
                }
            }
        }
        return arr1;
    }


    static int getMode(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        int maxferq = -1;
        int maxfreqKey = -1;
        for ( int key : freq.keySet()){
            int currentKey = key;
            int currentKeyFrequency = freq.get(key);
            if ( currentKeyFrequency > maxferq){
                maxferq = currentKeyFrequency;
                maxfreqKey = currentKey;
            }
        }
        return maxfreqKey;
    }

    static int[] getHighestFrequencyandLowestFrequency(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int maxFreqKey = -1, maxFreq = -1;
        int minFreqKey = -1, minFreq = Integer.MAX_VALUE;

        for (int key : freq.keySet()) {
            int f = freq.get(key);
            if (f > maxFreq) {
                maxFreq = f;
                maxFreqKey = key;
            }
            if (f < minFreq) {
                minFreq = f;
                minFreqKey = key;
            }
        }

        return new int[]{maxFreqKey, minFreqKey};
    }


    static void main() {
        int arr[] = {1,2,3,4,5,5,5,5,1};
        int ans[] = reverseArray(arr);
        for (int i : ans){
            System.out.print(i +" ");
        }
        System.out.println();
        int ans1[] = shiftByOne(arr);
        for (int i : ans1){
            System.out.print(i +" ");
        }
        System.out.println();
        int ans2[] = extreamAlternative(arr);
        for (int i : ans2){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println(getMode(arr));

        int ans3[] = getHighestFrequencyandLowestFrequency(arr);
        for (int i : ans3){
            System.out.print(i +" ");
        }
    }
}