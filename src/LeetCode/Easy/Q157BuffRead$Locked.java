package LeetCode.Easy;

/**
 * Given a file and assume that you can only read the file using a given method read4, implement a method to read n characters.
 * <p>
 * Method read4:
 * <p>
 * The API read4 reads four consecutive characters from file, then writes those characters into the buffer array buf4.
 * <p>
 * The return value is the number of actual characters read.
 * <p>
 * Note that read4() has its own file pointer, much like FILE *fp in C.
 * <p>
 * Definition of read4:
 * <p>
 * Parameter:  char[] buf4
 * Returns:    int
 * <p>
 * buf4[] is a destination, not a source. The results from read4 will be copied to buf4[].
 * Below is a high-level example of how read4 works:
 * <p>
 * <p>
 * File file("abcde"); // File is "abcde", initially file pointer (fp) points to 'a'
 * char[] buf4 = new char[4]; // Create buffer with enough space to store characters
 * read4(buf4); // read4 returns 4. Now buf4 = "abcd", fp points to 'e'
 * read4(buf4); // read4 returns 1. Now buf4 = "e", fp points to end of file
 * read4(buf4); // read4 returns 0. Now buf4 = "", fp points to end of file
 * <p>
 * <p>
 * Method read:
 * <p>
 * By using the read4 method, implement the method read that reads n characters from file and store it in the buffer array buf. Consider that you cannot manipulate file directly.
 * <p>
 * The return value is the number of actual characters read.
 * <p>
 * Definition of read:
 * <p>
 * Parameters:	char[] buf, int n
 * Returns:	int
 * <p>
 * buf[] is a destination, not a source. You will need to write the results to buf[].
 * Note:
 * <p>
 * Consider that you cannot manipulate the file directly. The file is only accessible for read4 but not for read.
 * The read function will only be called once for each test case.
 * You may assume the destination buffer array, buf, is guaranteed to have enough space for storing n characters.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: file = "abc", n = 4
 * Output: 3
 * Explanation: After calling your read method, buf should contain "abc". We read a total of 3 characters from the file, so return 3.
 * Note that "abc" is the file's content, not buf. buf is the destination buffer that you will have to write the results to.
 * Example 2:
 * <p>
 * Input: file = "abcde", n = 5
 * Output: 5
 * Explanation: After calling your read method, buf should contain "abcde". We read a total of 5 characters from the file, so return 5.
 * Example 3:
 * <p>
 * Input: file = "abcdABCD1234", n = 12
 * Output: 12
 * Explanation: After calling your read method, buf should contain "abcdABCD1234". We read a total of 12 characters from the file, so return 12.
 */

public class Q157BuffRead$Locked {

    public int read(char[] buf, int n) {
        StringBuilder sb = new StringBuilder();
        char[] buf4 = new char[4];
        int buffRead = 1;
        int buffReadLength = 0;
        while (buffRead > 0 && buffReadLength < n) {
//            buffRead = read4(buf4);
            for (int i = 0; i < buffRead && buffReadLength < n; i++) {
                buf[buffReadLength] = buf4[i];
                buffReadLength++;
            }

        }
        return buffReadLength;
    }
}
