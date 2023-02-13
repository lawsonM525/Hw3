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
     * adds all elements within an array recursively
     * @param array array with elements to be added
     * @param length length of array
     * @return integer sum of elements
     */
    public static int addAllRec(int[] array, int length){
        if(length == 0){ //base case
            return 0;
        }
        return addAllRec(array, length-1) + array[length-1]; //recursive call
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
     * multiplies all elements within an array recursively
     * @param array array with elements to be multiplied
     * @param length length of array
     * @return integer product of elements
     */
    public static int multiplyAllRec(int[] array, int length){
        if(length == 1){ //base case
            return 1;
        }
        return multiplyAllRec(array, length-1) * array[length-1]; //recursive call
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

    /**
     * checks if an array contains a value by searching recursively
     * @param array array to be checked
     * @param value value we are looking for
     * @param length length of array
     * @return boolean true if value is in array, false if not
     */
    public static boolean isElementRec(int[] array, int value, int length){
        if(length == 0){ //base case
            return false;
        }
        if(array[length-1] == value){ //recursive call
            return true;
        }
        return isElementRec(array, value, length-1);
    }

    /**
     * finds the smallest element in an array iteratively
     * @param array array to be checked
     * @return integer smallest element in array
     */
    public static int findMin(int[] array){
        int min = array[0];
        for(int i=0; i<array.length; i++){ //loops through array and checks if each element is smaller than min
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    /**
     * finds the smallest element in an array recursively
     * @param array array to be checked
     * @param length length of array
     * @return integer smallest element in array
     */
    public static int findMinRec(int[] array, int length){
        if(length == 1){ //base case
            return array[0];
        }
        if (array[length-1] < findMinRec(array, length-1)){ //recursive call
            return array[length-1];
        }
        return findMinRec(array, length-1);
    }

    /**
     * finds the largest element in an array iteratively
     * @param array array to be checked
     * @return integer largest element in array
     */
    public static int findMax(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){ //loops through array and checks if each element is larger than max
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /**
     * finds the largest element in an array recursively
     * @param array array to be checked
     * @param length length of array
     * @return integer largest element in array
     */
    public static int findMaxRec(int[] array, int length){
        if(length == 1){ //base case
            return array[0];
        }
        if (array[length-1] > findMaxRec(array, length-1)){ //recursive call
            return array[length-1];
        }
        return findMaxRec(array, length-1);
    }

}