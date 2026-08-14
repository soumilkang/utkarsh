public class q5 {

    public static int singleNumber(int[] nums) {

        int ones = 0;
        int twos = 0;

        for (int i = 0; i < nums.length; i++) {

            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }

        return ones;
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 2, 7, 5, 2, 7, 5, 7, 9};

        System.out.println(singleNumber(arr));
    }
}
