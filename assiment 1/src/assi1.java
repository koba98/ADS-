public class assi1 {
    //problem 1
    public static int min(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], min(arr, n - 1));
    }

    //problem 2
    public static double avg(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }

        return (arr[n-1] + (n-1)*avg(n-1, arr))/n;
    }

    //problem 3
    public static boolean isprim(int n, int m) {
        if (m == 1) {
            return true;
        }
        if (n <= 1) {
            return false;
        }

        if (n % m == 0) {
            return false;
        }

        return isprim(n, m - 1);
    }

    //problem 4
    public static long factorialElem(int n){
        if (n <= 1) {
            return 1;
        }
        return n * factorialElem(n - 1);
    }

    //problem 5
    public static long fib(int n , long[] mem){
        if(mem[n] != -1) {
            return mem[n];
        }
        if (n <= 1) {
            return n;
        }
        long res = fib(n - 1, mem)*fib(n - 2, mem);
        mem[n] = res;

        return res;
    }

    //problem 6
    public static long aPowerOfN(int n, int a) {
        if (n == 0) {
            return 1;
        }
        return a * aPowerOfN(n - 1, a);
    }

    //problem 7
    public static void var(String first_string, String exc_string){
        if (first_string.isEmpty()) {
            System.out.println(exc_string);
            return;
        }
        for (int i = 0; i < first_string.length(); i++){
            char ch = first_string.charAt(i);

            String result = first_string.substring(0, i) + first_string.substring(i + 1);

            var(result, exc_string + ch);
        }
    }

    //problem 8
    public static boolean checkN(String FirstString, int index) {
        if (index == FirstString.length()) {
            return true;
        }

        if (Character.isDigit(FirstString.charAt(index))) {
            return false;
        }

        return checkN(FirstString, index + 1);
    }

    //problem 9
    public static int binomCoeff(int n, int k){
        if (k == 0 || k == n) {
            return 1;
        }
        return binomCoeff(n - 1, k - 1) + binomCoeff(n - 1, k);
    }

    //problem 10
    public static int euclid(int n, int m){
        if(m ==0){
            return n;
        }

        return euclid(n, n%m);
    }







}