public  class Datatype {
    public static void main(){
        // Numeric Datatype
        byte num1 = 127; // range of byte data type are -127 to 127
        System.out.println(num1);

        short num2 = 5000;
        System.out.println(num2);

        int  num3 = 50000;
        long num4 = 324567;
        System.out.println(num3);
        System.out.println(num4);

        // Float Datatype
        float num5 = 6.706f;
        double num6 = 6.555555555;
        System.out.println(num5);
        System.out.println(num6);

        // Character Datatype
        char name = 'R';
        System.out.println(name);

        // Boolean Datatype
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);


        // Datatype Implicit od Emplicit Conversion
        long value1 = 1234567899;
        int value2 = (int)value1;
        System.out.println(value2);

    }
}