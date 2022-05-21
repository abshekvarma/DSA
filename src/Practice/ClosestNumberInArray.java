package Practice;

public class ClosestNumberInArray {
    public static void main(String[] args) {
        int[] arr ={1,3,5,76,34,54,89,62};
        int element = 67;
        int min =Integer.MAX_VALUE,value=0;
        for (int j : arr) {
            int closestDiff = j > element ? j - element : element - j;
            if (closestDiff < min) {
                min = closestDiff;
                value = j;
            }
        }
        System.out.println("minimum value is: "+value);
    }
}
