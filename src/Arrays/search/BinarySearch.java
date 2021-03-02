package Arrays.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int position = search(arr, 0, arr.length-1, 50);
        if(position == -1) {
            System.out.print("notfound");
        } else {
            System.out.print(++position);
        }
    }

    //complexity O(logn)
    public static int search(int arr[], int start, int end, int toBeSearched) {
        if (start <= end) {
            if (start == (arr.length - 1) && end == 0) {
                return -1;
            }
            int mid = (start + end) / 2;
            if (arr[mid] == toBeSearched) {
                return mid;
            }
            if (arr[start] > toBeSearched && arr[end] < toBeSearched)
                return search(arr, start, mid, toBeSearched);

            return search(arr, mid + 1, end, toBeSearched);
        }
        return -1;
    }
}
