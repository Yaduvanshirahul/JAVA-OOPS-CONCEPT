
import java.util.Arrays;

/* Find duplicate in arrys */

public class Class10 {
    public static int duplicate(int[] arr){
        first:
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[j];
                }
        }
    }
    return -1;
}

public static int duplicate1(int[] arr){
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
            return arr[i];
        }
    }
    return -1;
}


    public static void main(String[] args) {
        int[] arr = new int[]{0,2,1,3,2};
     //   System.out.println(duplicate(arr));
        System.out.println("after applying new method");
        System.out.println(duplicate1(arr));
        
    }
}
