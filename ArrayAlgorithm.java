public class ArrayAlgorithm {
    //implement recursive function for each of these
    //test both iterative and recursive functions

    /**
     * adds all elements within an array iteratively
     * @param array array with elements to be added
     * @return integer sum of elements
     */
    public static int addAll(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){ //loops through array and adds each element to sum
            sum = sum + array[i];
        }
        return sum;
    }

    /**
     * multiplies all elements within an array iteratively
     * @param array array with elements to be multiplied
     * @return integer product of elements
     */
    public static int multiplyAll(int[] array){
        int product = 1;
        for(int i=0; i<array.length; i++){ //loops through array and multiplies each element to product
            product *= array[i];
        }
        return product;
    }

    /**
     * checks if an array contains a value by searching iteratively
     * @param array array to be checked
     * @param value value we are looking for
     * @return boolean true if value is in array, false if not
     */
    public static boolean isElement(int[] array, int value){
        for(int i=0; i<array.length; i++){
            if(array[i] == value){//loops through array and checks if value is in array
                return true;
            }
        }
        return false;
    }


}