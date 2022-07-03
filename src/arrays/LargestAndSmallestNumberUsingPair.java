package arrays;

import java.lang.reflect.ParameterizedType;

public class LargestAndSmallestNumberUsingPair {

    static class Pair {
        int min;
        int max;
    }


    public static Pair getMinMax(int[] arr,int n){
        Pair minMax = new Pair();

//        If There is only one element in the array
        if (n == 1) {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }

//        If more than one element then
        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        } else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

//        For loop to Iterate through all the elements
        for(int i = 2; i < n ; i++){
            if(arr[i] > minMax.max){
                minMax.max = arr[i];
            }
            else if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }

        return minMax;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Pair minMax = getMinMax(arr,8);
        System.out.println("The Smallest Number is: "+minMax.min);
        System.out.println("The Largest Number is: "+minMax.max);

    }
}
