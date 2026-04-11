public class pattern {
    static void main() {
        // solid star pattern
//        int n = 5;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Solid Rectangular pattern
//        for (int i = 1; i <= 3; i++){
//            for (int j = 1; j <= 5; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Right angle triangle
//        for (int i = 1; i <= 5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // solid roumus
        /*int n = 10;
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j < 2 * n; j++ ){
                if(j <= n-i || j > 2 * n-i ){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }*/

        // inverted right angle
//        int n = 5;
//        for ( int i = 1; i <= n; i++){
//            for(int j = 1; j <= n - i + 1 ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Solid Triangle
//        int n = 5;
//        for (int row = 1; row <=  n; row++) {
//            for (int col = 1; col < 2 * n; col++) {
//                if (col <= n - row || col >= row + n) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


        // inverted triangle
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//            for(int col = 1; col < 2 * n; col++ ){
//                if(col < row || col > 2 * n - row ){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        // doted rectangle
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//            for(int col = 1; col <= 6; col++){
//                if(row == 1 || row == n ){
//                    System.out.print("* ");
//                }else{
//                    if(col == 1){
//                        System.out.print("* ");
//                    } else if (col == 6) {
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }


        // holo trangle
//        int n = 5;
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= n; col++){
//                if(row == col || col == 1 || row == n){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


        // holo  pyramid
//        int n = 5;
//        for (int row = 1; row <= n; row++){
//            for(int col = 1; col < 2 * n; col++){
//                if(col < n - row || col > n + row){
//                    System.out.print("  ");
//                }else{
//                    if(row == n || col == n - row + 1 || col == n + row -1){
//                        System.out.print("* ");
//                    }else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }


        // kaju katli
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col < 2 * n ; col++){
//                if(col <= n - row || col >= n + row){
//                    System.out.print("  ");
//                }else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//        for (int row = 2; row <= n; row++){
//            for(int col = 1; col < 2 * n; col++ ){
//                if(col < row || col > 2 * n - row ){
//                    System.out.print("  ");
//                }else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
        // optimal splution
//        int n = 4;
//
//        for (int row = 1; row <= 2 * n - 1; row++) {
//
//            int totalColsInRow = row <= n ? row : 2 * n - row;
//
//            int spaces = n - totalColsInRow;
//
//            // print spaces
//            for (int s = 1; s <= spaces; s++) {
//                System.out.print("  ");
//            }
//
//            // print stars
//            for (int col = 1; col <= 2 * totalColsInRow - 1; col++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }


        // holo diamond
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//            for(int col = 1; col < 2 * n; col++){
//                if(col < n - row || col > n + row){
//                    System.out.print("  ");
//                }else{
//                    if(col == n - row + 1 || col == n + row -1){
//                        System.out.print("* ");
//                    }else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//
//        for (int row = 2; row <= n; row++){
//            for(int col = 1; col < 2 * n; col++){
//                if( col == row || col == 2 * n -row){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // N
//        int n = 4;
//        for (int row = 1; row <= 2 * n; row++){
//            for(int col = 1; col <= 2 * n; col++){
//                if(col == 1 || col == 2 * n || col == row ){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


        // butterfly
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//            for(int col = 1; col <= row; col++){
//                    System.out.print("* ");
//            }
//            for(int col = 1 ; col <= 2 * (n-row); col++){
//                System.out.print("  ");
//            }
//            for(int col =1 ; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = 1; row <= n; row++){
//            for(int col = 1; col <= n - row + 1; col++){
//                System.out.print("* ");
//            }
//            for(int col = 1; col <= 2 * (row - 1); col++){
//                System.out.print("  ");
//            }
//            for(int col = 1; col <= n - row + 1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        //half triangle number
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(" "+col);
//            }
//            System.out.println();
//        }

        // half trinagle number
//        int n = 4;
//        int count = 1;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(" "+count);
//                count ++;
//            }
//            System.out.println();
//        }

        // right angle
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                char ans = (char)(col + ('A' - 1));
//                System.out.print(" "+ans);
//            }
//            System.out.println();
//        }
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                char ans = (char)(n - col + ('A'));
//                System.out.print(" "+ans);
//            }
//            System.out.println();
//        }

        //
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//            for(int col = 1; col < 2 * n; col++){
//                if(col < row || col > 2 * n - row){
//                    System.out.print("  ");
//                }else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//        for (int row = 1; row < n; row++){
//            for(int col = 1; col < 2 * n; col++){
//                if(col < n - row || col > n + row){
//                    System.out.print("  ");
//                }else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }


        //
//        int n = 4;
//
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= n - row; col++){
//                System.out.print("  ");
//            }
//            for(int col = 1; col <= row; col++){
//                System.out.print(col+" ");
//            }
//            int k = row - 1;
//            for (int col = 1; col <= row - 1; col++){
//                System.out.print(k +" ");
//                k--;
//            }
//            System.out.println();
//        }



        //
        int n = 4;

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n - row; col++){
                System.out.print("  ");
            }
            int k = row ;
            for(int col = 1; col <= row; col++){
                System.out.print(k+" ");
            }
            for (int col = 1; col <= row - 1; col++){
                System.out.print(k +" ");

            }
            System.out.println();
        }
    }
}