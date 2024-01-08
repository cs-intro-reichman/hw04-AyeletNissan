public class ArrayOps {
    public static void main(String[] args) {
        int[] ret = {3,0,1};
        int re = findMissingInt(ret);
        System.out.println(re);

        int[] rett = {0,1,2,3,4,6};
        int ree = findMissingInt(rett);
        System.out.println(ree);
    }
    
    public static int findMissingInt (int [] array) {

        boolean exist=false;

        for(int j=0; j<=array.length; j++){
            for(int i=0; i<array.length; i++){
                if(array[i]==j) exist=true;
                if(exist==false && i==array.length-1) return j;
            }
            exist=false;
        }
        return -1;
   }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
