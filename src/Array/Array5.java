package Array;

import java.util.ArrayList;
import java.util.List;

public class Array5 {

    static List<Integer> findSeprateNumber(int[] arr){
        List<Integer> ans = new ArrayList<>();
              int n = arr.length;
              for (int index = 0; index < n; index++){
                  int value = Math.abs(arr[index]);
                  int position = value-1;
                  if(arr[position] > 0){
                      arr[position] = -arr[position];
                  }
              }
              for (int i = 0; i < n; i++){
                  if(arr[i] > 0){
                      int valueAtThisIndex = i+1;
                      ans.add(valueAtThisIndex);
                  }
              }
              
              return ans;
    }


    static void main() {
        int arr[] = {1,4,4,5,2,2};
        List<Integer> ans = findSeprateNumber(arr);
        for (int i : ans){
            System.out.println(i);
        }

    }
}