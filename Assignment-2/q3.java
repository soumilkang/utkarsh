public class q3{
    public static int binary(int num[],int key)
    {
        int start=0,end=num.length-1;
        int ans=num.length;
        while(start<=end){
            int mid=(start+end)/2;

            if(num[mid]>=key){
               ans=mid;
               end=mid-1;
            }
            if(num[mid]<key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    




    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=6;
        System.out.println(binary(num,key));
    }
}
