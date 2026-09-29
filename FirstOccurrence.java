//1. Find the first occurrence of X Input: A = [10, 20, 30, 20, 40] X = 20 Output: First occurrence of 20 = index 1 
public class FirstOccurrence {
    public static void main(String[] args) {
        int[] A = {10,20,30,20,40};
        int X = 20;

        int index = -1; // -1 if element not found
        for(int i=0;i<A.length;i++){
            if(A[i]==X){
                index = 1;
                break; //first occurrence found,loop stop

            }
        }
        if(index!=-1){
            System.out.println("First occurrence of "+ X +" = index " + index);
        }else{
            System.out.println(X +"not found in the array");

        }
    }
}
