package arrays;

public class FindSmallestCharacterGreaterThenTarget {
    public static char findLargerAlphabet(char[] series, char targetAlphabet){
        int low = 0;
        int high = series.length-1;
        int mid = 0;

        if(targetAlphabet >= series[series.length-1] || targetAlphabet < series[0]) {
            return series[0];
        }
        else {
            while (low <= high) {
                mid = (low+high)/2;
                if (targetAlphabet == series[mid]) {
                    return series[mid + 1];
                } else if (targetAlphabet < series[mid]) {
                    high = mid - 1;
                } else if (targetAlphabet > series[mid]) {
                    low = mid + 1;
                }

            }
            return 'a';
        }
    }
    public static void main(String[] args) {
        char[] series = {'g','h','i','j','k'};
        char targetAlphabet = 'i';
        System.out.println("The Larger Character is: "+findLargerAlphabet(series,targetAlphabet));
    }
}
