package GeeksForGeeks.Arrays.search;

public class MinRotatedArray {

    public static int findMin(int[] arr) {
        if(arr.length == 1) return arr[0];
        if(arr.length == 2 && arr[0] < arr[1]) return arr[0];
        else if(arr.length == 2) return arr[1];

        int start = 0, end = arr.length - 1;
        while(start <= end) {
            if(start == end || arr[start] < arr[end]) return arr[start];

            int mid = start + (end - start)/2;
            if(arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,3,1,3}));
    }
}
