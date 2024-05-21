package Day99.DSA;

public class program1 {
    static public int rob(int[] nums) {
        int costPrevToPrevHouse = nums[0];

        if (nums.length == 1) {
            return costPrevToPrevHouse;
        }
        int costPrevHouse = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++) {
            int costCurrentHouse = Math.max(costPrevHouse, costPrevToPrevHouse + nums[i]);
            costPrevToPrevHouse = costPrevHouse;
            costPrevHouse = costCurrentHouse;
        }
        return costPrevHouse;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(rob(arr));
    }
}
