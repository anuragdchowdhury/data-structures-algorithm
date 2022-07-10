package arrays;

public class Deletion {

    public static void deleteIndex(int[] series, int size, int index){
        for(int i=index; i < size-1; i++){
            System.out.println("Moving "+series[i+1]+" to position "+(i));
            series[i] = series[i+1];
        }
    }
    public static void printArray(int[] series,int size){
        for(int i=0; i < size; i++){
            System.out.print(series[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] series = new int[100];
        series[0] = 12;
        series[1] = 16;
        series[2] = 19;
        series[3] = 20;
        series[4] = 28;
        series[5] = 32;
        series[6] = 54;
        int size = 7;
        deleteIndex(series,size,4);
        printArray(series,6);
    }
}
