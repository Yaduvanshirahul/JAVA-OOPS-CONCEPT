public class Class7 {
    public static int  swap(int[] arr, int result){
        int count=0;
      
       for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[i]+arr[j+1]==7){
                    ++count;
                }
                
            }
        }
        return  count;
    }
/* these method is only applicable for the sorted array */
    public static  int advswap(int[] arr, int result){
        int count=0;
        int sum=0;
        int start =0;
        int end=arr.length-1;

        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==result){
                ++count;
                start++;
                end--;
            }
            else if(sum>result){
                end--;
            }
            else{
                start++;
            }
        }
        return  count;

    }
       

    public static void main(String[] args) {
        int[] arr = new int[] {6,1,2,3,4,5};
        System.out.println(arr.length);
        int result = 7;
        System.out.println(swap(arr,result));
        System.out.println("using another method");
        System.out.println(advswap(arr, result));
       }
    }

