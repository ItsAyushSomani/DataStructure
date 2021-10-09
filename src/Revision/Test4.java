package Revision;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {
        int arr[] = {-10,-5,-3,-12,2, 20, 5, -20};
        int sum = -15;
        List<List<Integer>> output = twoSum(arr, sum);
        for(List<Integer> list: output) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> twoSum(int[] arr, int sum) {
        if(arr.length < 2) {
            return null;
        }
        Arrays.sort(arr);
        List<List<Integer>> output = new ArrayList<>();
        int leftPtr = 0;
        int rightPtr = arr.length - 1;
        while(leftPtr < rightPtr) {
            if(arr[leftPtr] + arr[rightPtr] == sum)  {
                List<Integer> outList = new ArrayList<>();
                outList.add(arr[leftPtr]);
                outList.add(arr[rightPtr]);
                output.add(outList);
                leftPtr++;
                rightPtr--;
            } else if(arr[leftPtr] + arr[rightPtr] < sum) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        }
        return output;
    }
}
