public class q4 {
    public static int[] twosum(int arr[],int target)
    {
        int start =0;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }
            else if(sum<target){
                start++;

            }
            else
            {
                end--;

            }
           
        }
         return new int[]{-1,-1};
    }


     public static void main(String[] args) {
     int arr[]={5,6,7,4,13,15};
     int target=9;
     int ans[]= twosum(arr,target);
     System.out.println(ans[0] + " " + ans[1]);  
    }
    
}
