package sorting;

public class InsertionSort {
    public static int[] sortArray(int[] series) {

//        Insertion Sort Code Here
        for(int i=1; i < series.length; i++){
//            Taking the second element from the array
            int key = series[i];
//            Taking just one element before the key element
            int j = i - 1;
//            While there is no-more larger value on the left side keep shifting
            while(j >= 0 && key < series[j]){
                series[j+1] = series[j];
                j--;
            }
//            Finally set the value of Key in one index before while broke
            series[j+1] = key;

        }
        return series;
    }

    public static void printArray(int[] series){
        for(Integer i : series){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] series = {4,7,8,9,5,11,2,6,12};
        printArray(sortArray(series));
    }
}
