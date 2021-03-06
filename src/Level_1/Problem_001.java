/*
 * Description: If we list all the natural numbers below 10 that are multiples of 3 or 5,
 *              we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Mission:     Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
package Level_1;

public class Problem_001 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) result += i;
        }
        System.out.println("Result is " + result);
    }
}
