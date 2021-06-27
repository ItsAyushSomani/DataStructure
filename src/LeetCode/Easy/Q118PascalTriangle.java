package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;
//Given an integer numRows, return the first numRows of Pascal's triangle.
//
// In Pascal's triangle, each number is the sum of the two numbers directly abov
//e it as shown:
//
//
// Example 1:
// Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:
// Input: numRows = 1
//Output: [[1]]
//
//
// Constraints:
//
//
// 1 <= numRows <= 30
//
// Related Topics Array Dynamic Programming
// 👍 2859 👎 140


//leetcode submit region begin(Prohibit modification and deletion)
class Q118PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        outerList.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> innerList = new ArrayList<>(i);
            List<Integer> prevRow = outerList.get(i - 1);
            innerList.add(1);
            for (int j = 1; j < i; j++) {
                innerList.add(prevRow.get(j - 1) + prevRow.get(j));

            }
            innerList.add(1);
            outerList.add(innerList);
        }
        return outerList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
