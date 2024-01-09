public class ArrayOps {
    public static void main(String[] args) {
        
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
        int max=0;
        int max2=0;
        int count=0;
        for(int i=0; i<array.length; i++){
            if(array[i]>max) max=array[i];
        }
        for(int j=0; j<array.length; j++){
            if(max==array[j]) count++;
        }
        if(count>1) return max;
        for(int r=0; r<array.length; r++){
            if(array[r]>max2 && array[r]!=max) max2=array[r];
        }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean exist=false;

        for(int j=0; j<array1.length; j++){
            for(int i=0; i<array2.length; i++){
                if(array1[j]==array2[i]) exist=true;
                if(exist==false && i==array2.length-1) return false;
            }
            exist=false;
        }

        for(int j=0; j<array2.length; j++){
            for(int i=0; i<array1.length; i++){
                if(array2[j]==array1[i]) exist=true;
                if(exist==false && i==array1.length-1) return false;
            }
            exist=false;
        }

        return true;
    }

    public static boolean isSorted(int [] array) {
        if(array[0] > array[array.length-1]){
            for(int i=0; i<array.length-1; i++){
                if(array[i]<array[i+1]) return false;
            }
        }
        else if(array[0] < array[array.length-1]){
            for(int i=0; i<array.length-1; i++){
                if(array[i]>array[i+1]) return false;
            }
        }
        return true;
    }

}
