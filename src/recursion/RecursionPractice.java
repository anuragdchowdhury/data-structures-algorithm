package recursion;

public class RecursionPractice {
public static int temp = 1;
    public static void printNumber(int n){
        if(temp > 10)
            return;
        System.out.println(temp);
        temp++;
        printNumber(n);
    }

    public static void main(String[] args) {

        printNumber(10);

    }
}
