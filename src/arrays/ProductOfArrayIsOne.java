package arrays;

public class ProductOfArrayIsOne {

    static int prodElement(int[] arr, int n){
        int step = 0;
        int zero = 0;
        int positive = 0;
        int negative = 0;

        for(int i=0; i < n; i++){
//            If Zero
            if(arr[i] == 0){
                zero++;
            }
            else if(arr[i] < 0){
                negative++;
                step = step + (-1-arr[i]);
            }
            else{
                positive++;
                step = step + (arr[i]-1);
            }
        }

        if(negative % 2 == 0){
            step = step + zero;
        }
        else {
            if(zero > 0){
                step = step + zero;
            }
            else {
                step = step + 2;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,2,-9,10,-1};
        System.out.println(prodElement(arr,6));
    }
}
