package binarySearch;

public class BinarySearchProblem {

    public static int performBinary(int[] series, int size,int element){
        int low=0;
        int high=size-1;

//        While to Keep Searching for element
        while(low <= high) {
            int mid= (low+high)/2;
            if (series[mid] == element){
                return mid;
            }
            if (series[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] series = {100,101,200,201,500,501,600};
        System.out.println("Element Found in: "+performBinary(series, 7,501)+" position of array.");
    }
}
