package arrays;

public class ReverseArray {

    public static void reverseArray(Integer[] array,int first,int last){
        int swap;
        if(first >= last)
            return;
        swap = array[last];
        array[last] = array[first];
        array[first] = swap;
        first++;
        last--;
        reverseArray(array,first,last);
    }

    public static void printAnArray(Integer [] array){
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {

        Integer [] array = {1,2,3,4,5,6,7,8};
        System.out.println("Array: ");
        printAnArray(array);
        System.out.println("");
        reverseArray(array,0,7);
        System.out.println("Reversed Array: ");
        printAnArray(array);
    }
}
