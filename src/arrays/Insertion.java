package arrays;

import java.lang.reflect.Array;

public class Insertion {
    public static int indInsert(int[] series,int size,int index,int element){
        if(size < series.length){
            for(int i=size-1; i >= index; i--){
                System.out.println("I am executing");
                System.out.println("Moving "+series[i]+" to position "+(i+1));
                series[i+1] = series[i];
            }
            series[index] = element;
            return 1;
        }
        else {
            return 0;
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
        int size = 4;

        if(indInsert(series,size,2,45) == 1){
            System.out.println("Inserted Array");
        printArray(series,size+1);
        }
        else {
            System.out.println("Element Cannot be Inserted");
        }

    }
}
