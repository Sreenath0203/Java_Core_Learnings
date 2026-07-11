package ProblemSolvingSet3;

import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3;

        for (int i = 0; i < nums2.length; i++) {
            nums1[m] = nums2[i];
            m++;
        }

        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}