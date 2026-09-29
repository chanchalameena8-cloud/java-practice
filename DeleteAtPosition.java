//6. Take position from the user and delete that element Input: A = [10, 20, 30, 40, 50] Position = 2 Output: [10, 20, 40, 50] 
import java.util.Scanner;

public class DeleteAtPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = {10, 20, 30, 40, 50};

        System.out.print("Enter position/index to delete: ");
        int position = sc.nextInt();

        // Shift elements to the left
        for (int i = position; i < A.length - 1; i++) {
            A[i] = A[i + 1];
        }

        // Print array after deletion
        System.out.print("Array after deletion: ");

        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }

        sc.close();
    }
}
