public class DeleteAtIndex {
   public DeleteAtIndex() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{10, 20, 30, 40, 50};
      byte var2 = 3;

      for(int var3 = var2; var3 < var1.length - 1; ++var3) {
         var1[var3] = var1[var3 + 1];
      }

      System.out.print("Array after deletion: ");

      for(int var4 = 0; var4 < var1.length - 1; ++var4) {
         System.out.print(var1[var4] + " ");
      }

   }
}
