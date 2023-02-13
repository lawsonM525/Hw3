public class IntAlgorithm {
    //sum1ton
    //product1ton
    //euclidean algorithm (gcd)
    //each one has iterative function, recursive function
    //implement tester for both iterative and recursive functions

    /**
     * adds all integers from 1 to n iteratively
     * @param n integer to be added
     * @return integer sum of integers from 1 to n
     */
    public static int sum1ton(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){ //loops through integers from 1 to n and adds each element to sum
            sum += i;
        }
        return sum;
    }

    /**
     * adds all integers from 1 to n recursively
     * @param n integer to be added
     * @return integer sum of integers from 1 to n
     */
    public static int sum1tonRec(int n){
        if(n == 1){ //base case
            return 1;
        }
        return sum1tonRec(n-1) + n; //recursive call
    }

    /**
     * multiplies all integers from 1 to n iteratively
     * @param n integer to be multiplied
     * @return integer product of integers from 1 to n
     */
    public static int product1ton(int n){
        int product = 1;
        for(int i=1; i<=n; i++){ //loops through integers from 1 to n and multiplies each element to product
            product *= i;
        }
        return product;
    }
    
    /**
     * multiplies all integers from 1 to n recursively
     * @param n integer to be multiplied
     * @return integer product of integers from 1 to n
     */
    public static int product1tonRec(int n){
        if(n == 1){ //base case
            return 1;
        }
        return product1tonRec(n-1) * n; //recursive call
    }

    /**
     * finds the greatest common divisor of two integers using the Euclidean algorithm iteratively
     * @param a integer to be divided
     * @param b integer to divide
     * @return integer greatest common divisor of a and b
     */
    public static int gcd(int a, int b){
        int remainder = a % b; //finds remainder of a/b
        while(remainder != 0){ //loops until remainder is 0
            a = b; //sets a to b
            b = remainder; //sets b to remainder
            remainder = a % b; //finds remainder of a/b
        }
        return b; //returns b
    }

    /**
     * finds the greatest common divisor of two integers using the Euclidean algorithm recursively
     * @param a integer to be divided
     * @param b integer to divide
     * @return integer greatest common divisor of a and b
     */
    public static int gcdRec(int a, int b){
        if(b == 0){ //base case
            return a;
        }
        return gcdRec(b, a%b); //recursive call
    }
}
