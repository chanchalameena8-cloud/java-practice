//2. Find the last occurrence of X Input: A = [10, 20, 30, 20, 40] X = 20 Output: Last occurrence of 20 = index 3 
public class LastOccurrence {
    public static void main(String[] args) {
        int[] A = {10,20,30,20,40};
        int X = 20;

        for (int i = A.length - 1;i>=0;i--){
            if(A[i]==X){
                System.out.println("Last occurrence of "+ X +"= index" + i);
                return;
            } 
        }
        System.out.println(X + "not found in the array");
    }
}
