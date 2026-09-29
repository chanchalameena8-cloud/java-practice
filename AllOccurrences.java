//4. Print every index where X occurs Input: A = [10, 20, 30, 20, 40, 20] X = 20 Output: Indices: 1 3 5 
public class AllOccurrences {

    public static void main(String[] args) {

        int[] A = {10, 20, 30, 20, 40, 20};
        int X = 20;

        System.out.print("Indices: ");

        for (int i = 0; i < A.length; i++) {

            if (A[i] == X) {
                System.out.print(i + " ");
            }
        }
    }
}
