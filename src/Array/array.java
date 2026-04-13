import java.util.Scanner;

public class array {
    static void main() {
        // Addition of all element
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            System.out.print("Enter array element index "+ i + " : ");
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for (int val : arr){
//            System.out.println(val);
//            sum += val;
//        }
//        System.out.println("Addition of all element:"+sum);

        // Multiplication of all element
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            System.out.print("Enter array element index "+ i + " : ");
//            arr[i] = sc.nextInt();
//        }
//        int sum = 1;
//        for (int val : arr){
//            System.out.println(val);
//            sum *= val;
//        }
//        System.out.println("Multiplication of all element:"+sum);

        //   Find maximum value in array
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            System.out.print("Enter array element index "+ i + " : ");
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int val : arr){
//            if(val > max){
//                max = val;
//            }
//        }
//        System.out.println("Maximum number of array :"+ max);


        // find minimum value in array
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            System.out.print("Enter array element index "+ i + " : ");
//            arr[i] = sc.nextInt();
//        }
//        int min = arr[0];
//        for (int val : arr){
//            if(val < min){
//                min= val;
//            }
//        }
//        System.out.println("Maximum number of array :"+ min);


        // 2D array
//        int [][] brr = {{1,2},{2,3},{3,3,6,7}};
//       System.out.println(brr[0][1]);
//        int rowlength = brr.length;
//        for(int row = 0; row < rowlength; row++){
//            int collength = brr[row].length;
//            for(int col = 0; col < collength; col++){
//                System.out.print(brr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // 2d array
//        int arr[][] = new int[3][];
//        allocate no of columns in each row manually
//        arr[0] = new int[5];  // Row 0 has 5 columns
//        arr[1] = new int[3]; //Row 1 has 3 columns
//        arr[2] = new int[1]; // row 2 has 1 column
//        Scanner sc = new Scanner(System.in);
//        int rowlength = arr.length;
//        for(int row = 0; row < rowlength; row++) {
//            int collength = arr[row].length;
//            for (int col = 0; col < collength; col++) {
//                System.out.println("Enter array element row" + row  + "  column" + col + ":");
//                arr[row][col] = sc.nextInt();
//            }
//        }
//        for(int row = 0; row < rowlength; row++){
//            int collength = arr[row].length;
//            for(int col = 0; col < collength; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // sum of all element in 2d array
//        int [][] brr = {{1,2},{2,3},{3,3,6,7}};
//       int sum = 0;
//        int rowlength = brr.length;
//        for(int row = 0; row < rowlength; row++){
//            int collength = brr[row].length;
//            for(int col = 0; col < collength; col++){
//                sum += brr[row][col];
//            }
//        }
//        System.out.println(sum);

        // multiply of all element in 2d array
//        int [][] brr = {{1,2},{2,3},{3,3,6,7}};
//        int mul = 1;
//        int rowlength = brr.length;
//        for(int row = 0; row < rowlength; row++){
//            int collength = brr[row].length;
//            for(int col = 0; col < collength; col++){
//                mul *= brr[row][col];
//            }
//        }
//        System.out.println(mul);


        // maximum value in 2d array
//        int [][] brr = {{1,2},{2,3},{3,3,6,7}};
//        int max = brr[0][0];
//        int rowlength = brr.length;
//        for(int row = 0; row < rowlength; row++){
//            int collength = brr[row].length;
//            for(int col = 0; col < collength; col++){
//                if ( max < brr[row][col]){
//                    max = brr[row][col];
//                }
//            }
//        }
//        System.out.println(max);


        // minimum value in 2d array
        int [][] brr = {{1,2},{2,3},{3,3,6,7}};
        int min = brr[0][0];
        int rowlength = brr.length;
        for(int row = 0; row < rowlength; row++){
            int collength = brr[row].length;
            for(int col = 0; col < collength; col++){
                if ( min > brr[row][col]){
                    min = brr[row][col];
                }
            }
        }
        System.out.println(min);

//        int arr[];
//        arr = new int[5];
//        int brr[] = {10, 20, 30, 40};
//        int n = brr.length;
//        for(int index = 0; index < n; index++){
//            System.out.println(brr[index]);
//        }

        // for each loop
//        for(int val : brr){
//            System.out.println(val);
//        }
//        System.out.println(brr[0]);
//        System.out.println(brr[1]);
//        System.out.println(brr[2]);
//        System.out.println(brr[3]);

    }
}