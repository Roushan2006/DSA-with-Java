public class Method{
    // print 2's table
    static void print2table(){
        for(int i = 1; i <= 10; i++){
            System.out.println("->"+2*i);
        }
    }

    // Sum of two number
    static void sum(int x, int y){
        System.out.println(x+y);
    }

    // multiplication
    static void multiplication(int a, int b){
        System.out.println(a * b);
    }

    // int return type
    static int suma(int a, int b){
        int sum = a + b;
        return sum;
    }

    // method overloded
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static void main() {
//        print2table();
        int num1 = 5;
        int num2 = 10;
        int num3 = 10;
        sum(num1, num2);
//        multiplication(num1, num2);
//        System.out.println(suma(num1, num2));
        System.out.println(sum(num1, num2, num3));
    }
}
