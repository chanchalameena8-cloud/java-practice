//8. Delete all occurrences of X Input: A = [10, 20, 30, 20, 40, 20] X = 20 Output: [10, 30, 40] 
public class DeleteAllOccurrence {

    public static void main(String[] args) {

        int[] A = {10, 20, 30, 20, 40, 20};
        int X = 20;

        int j = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] != X) {
                A[j] = A[i];
                j++;
            }
        }

        System.out.print("Array after deletion: ");

        for (int i = 0; i < j; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

