import java.util.Scanner;

public class conditionals {
    static void main(){

        // if condition
//        int age = 19;
//        if (age > 18){
//            System.out.println(" You are eligible for vote");
//        }


        // if else Statement
//        int age = 17;
//        if (age > 18){
//            System.out.println(" You are eligible for vote");
//        }
//        else{
//            System.out.println(" You are not eligible for vote");
//        }

        // else if ladder
//        int age = 50;
//        if (age <= 5 ){
//            System.out.println(" You are child");
//        }
//        else if(age <= 17){
//            System.out.println(" Your are not eligible for vote");
//        }
//        else{
//            System.out.println(" Your are  eligible for vote");
//        }

        // Switch Statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of day:");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}