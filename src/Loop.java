public class Loop {
    static void main() {
        // for loop
        // Print odd number between 1 and 10
//        for (int i = 1; i <= 10; i+= 2){
//            System.out.println(i);
//        }

        // Print fitst 5 number
//        for ( int i = 1; i <= 5; i++ ){
//            System.out.println(i);
//        }

        // Print all the even number between 1 and 50
//        for ( int i = 2; i <= 50; i+= 2 ) {
//            System.out.println(i);
//        }

        // Nested loop
//        for  (int i = 1; i <= 3; i++){
//            for (int j = 1;  j <= 3; j++) {
//                System.out.println("i: "+ i + (", j: "+ j));
//            }
//        }

        // print the square pattern
//        for  (int i = 1; i <= 3; i++){
//            for (int j = 1;  j <= 3; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Break keyword
//        for ( int i = 1; i <= 10; i++ ) {
//            if(i ==5){
//                break;
//            }
//            System.out.println(i);
//        }


        // Continue Keyword
//        for ( int i = 1; i <= 10; i++ ) {
//            if(i == 5){
//                continue;
//            }
//            System.out.println(i);
//        }



        // While loop
//        int i = 1;        // initialization
//
//        while(i <= 5){            // condition
//            System.out.println(i);
//            i++;                    // update
//        }


        //  Nested while loop
//        int i = 1;
//        while(i <= 2){
//            int j = 1;
//
//            while (j <= 3){
//                System.out.println("i: "+ i + ", j: "+ j);
//                j++;
//            }
//            i++;
//        }

        // Do While loop
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i <= 5);

        // At least one time run when condition is false
        int i = 10;
        do {
            System.out.println(i);
            i++;
        }while (i <= 5);
    }
}