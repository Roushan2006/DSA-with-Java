import java.util.Scanner;

public class string {
    static void main() {
        // creation string Literal
//        String str = "Roushan";
//        System.out.println(str);

        // creation string  new keyword
//        String str = new String("Roushan");
//        System.out.println(str);
//        // length of string
//        System.out.println(str.length());
//        // return character of index 4
//        System.out.println(str.charAt(4));

        
        String name1 = "Roushan";
        String name2 = "RoUshan";
        // == operator it compare to reference
//        if (name2 == name1){
//            System.out.println("Both string are equal");
//        }else {
//            System.out.println("Both string are not equal");
//        }

        // .equal() method is case sensetive it compare to character by character
//        if (name2.equals(name1)){
//            System.out.println("Both string are equal");
//        }else {
//            System.out.println("Both string are not equal");
//        }

        // .equalIgnoreCase() method is not case sensetive it compare to character by character
//        if (name2.equalsIgnoreCase(name1)){
//            System.out.println("Both string are equal");
//        }else {
//            System.out.println("Both string are not equal");
//        }

        // How to get input string by user
        Scanner sc = new Scanner(System.in);
        // next() it get single word.
//        System.out.print("Enter yor first word : ");
//        String str = sc.next();
//        System.out.println(str);

        // nextLine it get whole of line as string
//        System.out.print("Enter yor first word : ");
//        String str = sc.nextLine();
//        System.out.println(str);


        // print each character of string
//        System.out.println("Enter string ");
//        String str = sc.nextLine();
//        char[] character = str.toCharArray();
//        for (char val : character){
//            System.out.println(val);
//        }

        // Count length of string without length()
//        System.out.print("Enter string ");
//        String str = sc.nextLine();
//        int n = 0;
//        char[] character = str.toCharArray();
//        for (char val : character){
//            n += 1;
//        }
//        System.out.println("Length of character : " + n);


        // count vowel in string
//        System.out.print("Enter string ");
//        String str = sc.nextLine();
//        int count = 0;
//        // Convert to lowercase to handle both case types easily
//        String lowerStr = str.toLowerCase();
//
//        for (int i = 0; i < lowerStr.length(); i++) {
//            char ch = lowerStr.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                count++;
//            }
//        }
//        System.out.println("Vowels: " + count);


        // reverse of string
//        System.out.print("Enter string ");
//        String str = sc.nextLine();
//        char[] charArray = str.toCharArray();
//        int left = 0, right = charArray.length - 1;
//        while (left < right) {
//            char temp = charArray[left];
//            charArray[left] = charArray[right];
//            charArray[right] = temp;
//            left++;
//            right--;
//        }
//        String result = new String(charArray);
//        System.out.println(result);

        // check string is palindrom
        System.out.print("Enter string ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String result = new String(charArray);
        if(str.equalsIgnoreCase(result)){
            System.out.println("String is panindrrom");
        }else {
            System.out.println("String is not panindrrom");

        }
    }

}
