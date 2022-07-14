package binarySearch;

public class FindTheCeilingNumber {

    public static int findCeilingNumber(int[] series, int targetNumber) {
        int low = 0;
        int high = series.length - 1;
        int mid = 0;

        if (targetNumber > series[series.length - 1] || targetNumber < series[0]) {
            return -1;
        } else {
            while (low <= high) {
                mid = (low + high) / 2;
                if (series[mid] == targetNumber) {
                    return series[mid];
                } else if (series[mid] < targetNumber) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return series[low];
        }
    }
    public static void main(String[] args) {
        int[] series = {3,4,7,9,11,12,13,18};
        System.out.println(findCeilingNumber(series,17));
    }
}
