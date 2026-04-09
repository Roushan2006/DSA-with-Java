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
        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row == col || col == 1 || row == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}