class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1과 nums2를 병합하여 저장할 인덱스 변수 i, j, k 초기화
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // nums1과 nums2의 값들을 비교하면서 큰 값을 nums1의 끝부터 저장
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // nums2 배열에 값이 남아있는 경우 nums2의 나머지 값들을 nums1에 저장
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}