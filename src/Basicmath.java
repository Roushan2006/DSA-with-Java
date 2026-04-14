public class Basicmath {
    // print Digits of number
    static void Printdigits(int number){
        while (number > 0){
            int digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
    }

    // count digits of a number
    static int countdigit(int number){
        int count = 0;
        while (number > 0){
            int digit = number % 10;
            count++;
            number = number / 10;
        }
        return  count;
    }

    // sum of digit of a number
    static int sumofdigit(int number){
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }

    // reverse of number
    static int reverse(int number){
        int rev = 0;
        while (number > 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        return rev;
    }

    // palindrome number
    static void palindrome(int number){
        int org = number;
        int rev = 0;
        while (number > 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        if (org == rev){
            System.out.println("number is palindrom");
        }else {
            System.out.println("Number is not palindrom");
        }
    }


    // prime number
    static boolean checkprimenumber(int number){
        int count = 1;
        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0){
                count++;
            }
        }
        if(count == 1){
            return true;
        }else {
            return false;
        }
    }

    // GCD of two number
    static  int getgcd(int a, int b){
        // gcd(a,b) = gcd(b, a%b)
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Lcm of two number
    static  int lcm(int a, int b) {
        int s = a;
        int l = b;
        // gcd(a,b) = gcd(b, a%b)
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return (s * l)/a;
    }

    // armstrong number
    static void checkarmstrongnumber(int number){
        int n = countdigit(number);
        int armn = 0;
        int org = number;
        while (number > 0){
            int digit = number % 10;
            armn += Math.pow(digit, n);
            number = number / 10;
        }
        if (org == armn){
            System.out.println("number is armstrong");
        }else {
            System.out.println("Number is not armstrong");
        }
    }

    //perfect number
    static void checkperfectnumber(int number){
        int sum = 0;
        int org = number;
        for (int i = 1; i <= number / 2; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if(sum == org){
            System.out.println("perfect number");
        }else {
            System.out.println("Number is not perfect");
        }
    }

    // print all prime number from 1 to n
    static void printallprime(int n){
        for(int i = 2; i <= n; i++){
           boolean isprime = checkprimenumber(i);
           if(isprime == true){
               System.out.println(i);
           }
        }
    }

    static void main() {
        Printdigits(53125);
        int count = countdigit(56789);
        System.out.println(count);
        int ans = sumofdigit(457806);
        System.out.println(ans);
        int answer = reverse(54307);
        System.out.println(answer);
        palindrome(567657);
        checkprimenumber(70);
        int anas = getgcd(18,6);
        System.out.println(anas);
        int lcm = lcm(6, 18);
        System.out.println(lcm);
        checkarmstrongnumber(1634);
        checkperfectnumber(28);
        printallprime(17);
    }
}