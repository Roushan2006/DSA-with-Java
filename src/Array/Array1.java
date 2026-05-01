package Array;
public class Array1 {
    static double getAverage(int[] arr){
        double sum = 0;
        for (int i : arr ){
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static int[] multiplyBy10(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = arr[i] * 10;
        }
        return res;
    }

    static String searchElement(int[] arr, int n){
        int c = 0;
        for (int i : arr){
            if(i == n){
                c++;
            }
        }
        if (c == 0){
            return "Not Found";
        }
        return "Found";
    }

    static int maximumElement(int[] arr){
        int max = arr[0];
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int[] getPositiveNegativeSum(int[] arr){
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i : arr){
            if(i > 0){
                positiveSum +=i ;
            }
            else {
                negativeSum += i ;
            }
        }
        int ans[]= {positiveSum, negativeSum};
        return ans;
    }


    static int[] countZeroAndOne(int[] arr){
        int countZero = 0;
        int countOne = 0;
        for(int i : arr){
            if(i == 0){
                countZero ++;
            }
            else {
                countOne ++;
            }
        }
        int ans[] = {countZero, countOne};
        return ans;
    }


    static int getFirstUnsortedElement(int arr[]){
        int unsortedElement = 0;
        for (int i = 0 ; i < arr.length-1; i++){
            if(arr[i+1] < arr[i]){
                unsortedElement = arr[i+1];
                break;
            }
            unsortedElement = arr[0];
        }
        return unsortedElement;
    }

    static int[] swapAlternativeElement(int arr[]){
        int n = arr.length;
        int  res[] = new int[n];
        for (int i = 0; i < n; i +=2){
            res[i] = arr[i+1];
            res[i+1] = arr[i];
        }
        return res;
    }

    static int[] swapExtreamAlternativeElement(int arr[]){
        int n = arr.length;
        int[] res = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n; i += 2) {
            if (left <= right) {
                res[i] = arr[left++];
                if (i + 1 < n) {
                    res[i+1] = arr[right--];
                }
            }
        }
        return res;
    }






    static void main(String[] args) {
        int[] arr = {10,3,4,5};
        System.out.println(getAverage(arr));
        int[] ans = multiplyBy10(arr);

        System.out.println("print answer array:");
        for (int i : ans){
            System.out.println(i);
        }
        System.out.println(searchElement(arr,2));

        System.out.println("Maximum Number:" +maximumElement(arr));

        int arr2[] = {1,2,3,4,-1,-2,-3,-4};
        int[] answer = getPositiveNegativeSum(arr2);
        System.out.println("Positive sum : " + answer[0]);
        System.out.println("Negative sum : " + answer[1]);


        int arr3[] = {0,0,0,1,1,1,0,1,0};
        int ans1[] = countZeroAndOne(arr3);
        System.out.println("Count of zero : " +ans1[0]);
        System.out.println("Count of one : " +ans1[1]);


        int arr4[] = {2,4,5,6,3,8};
        System.out.println("First Unsorted Element :" +getFirstUnsortedElement(arr4));

        int arr5[] = {1,2,3,4,5,6};
        int[] ans2 = swapAlternativeElement(arr5);
        for(int i : ans2){
            System.out.print(i+" ");
        }
        System.out.println();

        int ans3[] = swapExtreamAlternativeElement(arr5);
        for (int i : ans3){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}