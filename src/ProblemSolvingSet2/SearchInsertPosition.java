package ProblemSolvingSet2;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println(mid);
                return;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If target is not found
        System.out.println(left);
    }
}