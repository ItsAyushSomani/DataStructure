package GeeksForGeeks;

import java.util.Arrays;

/**
 * String = any number of digits any number of spaces and hyphens
 * group of three numbers, between hyphen
 * 1 digit last and group of two at the end
 * no hyphen or spaces before or after the string
 * “344444” -> “344-444”
 * 3444 -> 34-44
 * 344-- 344 -> 344-344
 * 3444 => 344-
 */
public class Test {


    public static void main(String[] args) {
        System.out.println(reverseBit(100));
        System.out.println("Missing Number");
        System.out.println(missingNumber(new int[]{0, 1}));

        System.out.println(getSum(2, 3));


        System.out.println();
        System.out.println();
        System.out.println(solve(18));

    }
    public static void checkNumberOf1sTillNumber(String[] args) {
        int n = 8;
        int[] dp=new int[n+1];
        dp[0]=0;
        int offset=1;
        for(int i=1;i<=n;i++){
            if(offset*2==i){ //to check if 'i' is power of 2
                offset=i;
            }
            dp[i]= 1 + dp[i-offset];
        }
        System.out.println(Arrays.toString(dp));
    }

    public static int solve(int A) {
        int count = 0;
        while((A & 1) != 1) {
            System.out.println(Integer.toBinaryString(A));
            A >>= 1;
            count++;
        }
        return count;
    }
    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static int missingNumber(int[] nums) {
        int result = 0;
        for(int i = 1; i <= nums.length; i++) {
            result ^= nums[i- 1] ^ i;

        }
        return result;
    }

    public static int reverseBit(int n) {

            int ans = 0;
            for (int i = 0; i < 32; i++) {
                ans <<= 1;
                ans |= (n & 1);
                n >>= 1;
            }
            return ans;
    }
    public static void main1(String[] args) {
        String test = "abc!@#abc";
        char[] ch =  test.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while(start < end) {
            if(!Character.isLetter(ch[start]) && !Character.isDigit(ch[start])) {
                start++;
            } else if(!Character.isLetter(ch[end]) && !Character.isDigit(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }

        System.out.println(ch);
    }

}
