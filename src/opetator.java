public class opetator {
    static void main(){
        // Arithmatic Operator
        int num1 = 25;
        int num2 = 15;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);


        // Relational Operator
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);


        // Logical Operator
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println( !b);


        // Assignment Operator
        System.out.println(num1 += num2);
        System.out.println(num1 -= num2);
        System.out.println(num1 *= num2);
        System.out.println(num1 /= num2);
        System.out.println(num1 %= num2);

        // Unary operator
        System.out.println( +num2);
        System.out.println( -num2);
        System.out.println( ++num2);
        System.out.println(num1++);
        System.out.println(num1--);
        System.out.println( --num2);
        System.out.println( !b);


        // Ternary Operator
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd"; // result becomes "Odd"
        System.out.println(result);

    }
}