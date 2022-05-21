package Practice;

public class BinarySearch {
    private static int binarySearch(int[] arr, int x){
        int left =0, right =arr.length-1;
        if(left>right){
            return -1;
        }
        while(left<right){
            int mid = (left + right)/2;
            if(arr[mid]==x){
                return mid;
            }else if(x > arr[mid]){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,3,4,6,9,12,17,18};
        int index = binarySearch(arr, 17);
        if(index<0){
            System.out.println("Value not present");
        }else
        System.out.println("value is present at " + index);
    }
}
