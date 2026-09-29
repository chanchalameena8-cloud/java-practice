//3. Count how many times X occurs Input: A = [10, 20, 30, 20, 40, 20] X = 20 Output: 20 occurs 3 times 
public class CountOccurrence {

    public static void main(String[] args) {

        int[] A = {10, 20, 30, 20, 40, 20};
        int X = 20;

        int count = 0;   // Initial count is 0

        for (int i = 0; i < A.length; i++) {

            if (A[i] == X) {
                count++;   // X foun count 1  increase
            }
        }

        System.out.println(X + " occurs " + count + " times");
    }
}
