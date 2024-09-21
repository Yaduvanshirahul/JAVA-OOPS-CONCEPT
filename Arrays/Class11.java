

import  java.util.*;



/* Find multiple  duplicate 
 * 
 * 
 * abs(-7) = 7 
 */

public class Class11 {
    public static List<Integer>  findDuplicate(int[] nums){

          List<Integer> res = new ArrayList<>();

          
          for(int i=0;i<nums.length;i++){
            int element = Math.abs(nums[i]);
            if (element - 1 >= nums.length) {
                System.out.println("Element " + element + " is out of bounds.");
                continue;
            }
            int seat = element-1;
            if(nums[seat]<0){
                res.add(element);
            }
            else{
                nums[seat] = -nums[seat];
            }
          }

          return  res;
    }

    /* Optimize method */

public static void findDup(int[] arr){
    for(int i=0;i<arr.length;i++){
        int x = Math.abs(arr[i]);
        if(x>=arr.length){
            System.out.println("element is out of bound");
            continue;
        }
        if(arr[x]>0){
            arr[x]=-arr[x];
        }
        else{
            System.out.println(x);
        }
    }
}

/* only applicable when ist method comment then it will run */

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,3,4,1,5,6,7,2};
     System.out.println(findDuplicate(nums));
System.out.println();
int[] newcopy = new int[]{2,1,3,4,1,5,6,7,2};
       System.out.println("After applying optimize algorithm");
       findDup(newcopy);
    }
}
