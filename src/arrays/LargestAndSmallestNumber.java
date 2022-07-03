package arrays;

public class LargestAndSmallestNumber {

    public static int checker=0;

    public static void numberSorter(Integer[] array){
        int arrayLength = array.length;

        for (int i=1; i<arrayLength-1 ;i++) {
            if (array[i] > checker) {
                checker = array[i];
            }
        }
        System.out.println("Largest Number: "+checker);

        for (int i=1; i<arrayLength-1 ;i++) {
            if (array[i] < checker) {
                checker = array[i];
            }
        }
        System.out.println("Smallest Number: "+checker);

    }

//    Driver Code
    public static void main(String[] args) {
        Integer[] array = {113,223,8,96,70,10,118};
        numberSorter(array);
    }
}
