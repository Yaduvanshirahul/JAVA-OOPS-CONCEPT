/* Swap 0 , 1 and 2 */


public class Class9 {
    public static void swap(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
           }
        }
        }
        for(int x :arr){
            System.out.println(x);
        }
         
    }
/* optimize solution */
    public static void newswap(int[] arr){
        int left=0;
        int right = arr.length-1;
        int current =0;
        int temp;

        while(current<=right){
             if(arr[current]==0){
                temp=arr[left];
                arr[left]=arr[current];
                arr[current]= temp;

                left++;
                current++;
             }

             else if(arr[current]==2){
                temp=arr[current];
                arr[current]=arr[right];
                arr[right]=temp;

                right--;
             }
             else{
                current++;
             }
        }

        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,1,2,2,1,0};
        swap(arr);

        System.out.println("optimize solution");
        newswap(arr);
    }
}
