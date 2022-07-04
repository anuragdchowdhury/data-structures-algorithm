package sorting;

public class SelectionSort {
    public static int[] sortArray(int[] series) {

        for (int i = 0; i < series.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < series.length; j++) {
                if (series[j] < series[smallest]) {
                    smallest = j;
                }
            }
            //swap
            int temp = series[smallest];
            series[smallest] = series[i];
            series[i] = temp;
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
