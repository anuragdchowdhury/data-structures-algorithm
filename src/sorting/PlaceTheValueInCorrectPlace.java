package sorting;
//We have a problem where A is an Array with N elements already arranged in ascending order. You have been given a
//number X which is to be placed in the array in such a way that after insertion also the array remains in ascending order.

//Example Array int[] series={14,16,19,21} x= 17 Expected Output: int[] series={14,16,17,19,21}
public class PlaceTheValueInCorrectPlace {

    public static int[] sortArray(int[] series,int n){
        int[] newArray = new int[series.length+1];
        for(int k=0; k < series.length+1; k++){
            if(k == series.length){
                newArray[k] = n;
            }
            else{
                newArray[k] = series[k];
            }
        }

        for(int i = series.length; i < newArray.length; i++){
            int x = newArray[i];
            int j = i-1;
            while(j >= 0 && x < newArray[j]){
                newArray[j+1] = newArray[j];
                j--;
            }
            newArray[j+1] = x;
        }
        return newArray;
    }

    public static void printArray(int[] series) {
        for (Integer i : series) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] series = {14,16,19,21};
        int x = 17;
        printArray(sortArray(series,x));
    }
}
