package sorting;

public class BubbleSort {

    static int temp;

    public static int[] sortArray(int[] series){
        for(int i=0; i < series.length-1; i++){
            for(int j = 0; j < series.length-i-1; j++){
                if(series[j] > series[j+1]){
                    // swap
                    temp = series[j];
                    series[j] = series[j+1];
                    series[j+1] = temp;
                }
            }
        }
        return series;
    }

    public static void printArray(int[] series){
        for(Integer i : series){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] series = {4,7,8,9,2,11,17,1,5};
        printArray(sortArray(series));
    }
}