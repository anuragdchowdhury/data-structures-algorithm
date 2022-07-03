package arrays;

public class MissingNumber {
    static int sum;
    static int total;
    public static Integer findMissingNumber(int[] array,int n){
//        Finding Summation of n natural number. {1,2,3,4,5} because n=5
        total = n*(n+1)/2;

//        Finding actual value of the elements inside the array
        for(int i=0; i < array.length-1; i++){
            sum = sum + array[i];
        }

//        Subtracting to find the Missing Number
        total = total - sum;

        return total;
    }
    public static void main(String[] args) {

        int[] number = {1,2,4,5,6};

        System.out.println( findMissingNumber(number,5));
    }
}
