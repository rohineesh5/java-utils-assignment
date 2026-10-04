package MEthods;
public class Utils {

    // 1. Check whether a number is prime
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        int i = 2;

        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }


    // 2. Celsius to Fahrenheit
    public static double cToF(double celsius) {

        return (celsius * 9 / 5) + 32;
    }


    // 3. Count vowels
    public static int countVowels(String str) {

        int count = 0;
        int i = 0;

        while (i < str.length()) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }

            i++;
        }

        return count;
    }


    // 4. format - overloaded method
    public static String format(double salary) {

        return "$" + salary;
    }


    // 5. format - overloaded method
    public static String format(double salary, String currencySymbol) {

        return currencySymbol + salary;
    }


    // 6. getMax - two numbers
    public static int getMax(int a, int b) {

        if (a > b) {
            return a;
        }

        return b;
    }


    // 7. getMax - three numbers
    public static int getMax(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }


    // 8. Reverse array
    public static void reverse(int[] arr) {

        if (arr == null) {
            return;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


    // 9. Find index of minimum element
    public static int getMinIndex(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int minIndex = 0;
        int i = 1;

        while (i < arr.length) {

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }

            i++;
        }

        return minIndex;
    }


    // 10. Merge two arrays
    public static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0;

        while (i < a.length) {
            result[i] = a[i];
            i++;
        }

        int j = 0;

        while (j < b.length) {
            result[a.length + j] = b[j];
            j++;
        }

        return result;
    }


    // 11. Check palindrome
    public static boolean isPalindrome(String text) {

        if (text == null) {
            return false;
        }

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            char first = Character.toLowerCase(text.charAt(start));
            char last = Character.toLowerCase(text.charAt(end));

            if (first != last) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    // 12. Fibonacci
    public static int getFibonacci(int n) {

        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int i = 2;

        while (i <= n) {

            int c = a + b;

            a = b;
            b = c;

            i++;
        }

        return b;
    }
}