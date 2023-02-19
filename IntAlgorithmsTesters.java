public class IntAlgorithmsTesters {
    // Helper Functions
    /**
     * prints an array
     * @param array array to be printed
     */
    public static void printArray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //Testers for IntAlgorithm.java
    /**
     * tests sum1toN method
     */
    public static void testSum1toN(){
        System.out.println(" ==== Test sum1toN() ====");
        System.out.println("Sum of 1 to 5: " + IntAlgorithms.sum1toN(5));
    }

    /**
     * tests sum1toNRec method
     */
    public static void testSum1toNRec(){
        System.out.println(" ==== Test sum1toNRec() ====");
        System.out.println("Sum of 1 to 5: " + IntAlgorithms.sum1toNRec(5));
    }

    /**
     * tests product1toN method
     */
    public static void testProduct1toN(){
        System.out.println(" ==== Test product1toN() ====");
        System.out.println("Product of 1 to 5: " + IntAlgorithms.product1toN(5));
    }

    /**
     * tests product1toNRec method
     */
    public static void testProduct1toNRec(){
        System.out.println(" ==== Test product1toNRec() ====");
        System.out.println("Product of 1 to 5: " + IntAlgorithms.product1toNRec(5));
    }

    /**
     * tests gcd method
     */
    public static void testGcd(){
        System.out.println(" ==== Test gcd() ====");
        System.out.println("GCD of 12 and 18: " + IntAlgorithms.gcd(12, 18));
    }

    /**
     * tests gcdRec method
     */
    public static void testGcdRec(){
        System.out.println(" ==== Test gcdRec() ====");
        System.out.println("GCD of 12 and 18: " + IntAlgorithms.gcdRec(12, 18));
    }

    //Main method
    public static void main(String[] args){
        testSum1toN();
        testSum1toNRec();
        testProduct1toN();
        testProduct1toNRec();
        testGcd();
        testGcdRec();
    }
    
}
