//7. Search for X and delete it Delete the first occurrence of X. Input: A = [10, 20, 30, 20, 40] X = 20 Output: [10, 30, 20, 40] 
public class SearchAndDelete {

    public static void main(String[] args) {

        int[] A = {10, 20, 30, 20, 40};
        int X = 20;

        int index = -1;   // Element not found initially

        //  Search for the first occurrence
        for (int i = 0; i < A.length; i++) {

            if (A[i] == X) {
                index = i;
                break;    // First occurrence found
            }
        }

        //  Delete the element by shifting left
        if (index != -1) {

            for (int i = index; i < A.length - 1; i++) {
                A[i] = A[i + 1];
            }

            // Print array after deletion
            System.out.print("Array after deletion: ");

            for (int i = 0; i < A.length - 1; i++) {
                System.out.print(A[i] + " ");
            }

        } else {
            System.out.println(X + " not found in the array");
        }
    }
}
