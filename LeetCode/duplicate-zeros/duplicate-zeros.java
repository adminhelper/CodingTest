class Solution {
    public int[] duplicateZeros(int[] arr) {
        int countZero = 0;
        int length = arr.length;

        // 첫 번째 반복문에서 0의 개수를 세어줍니다.
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }

        // 두 번째 반복문에서 배열의 뒷쪽부터 0을 삽입합니다.
        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                if (i + countZero < length) {
                    arr[i + countZero] = 0;
                }
                countZero--;
            }
            if (i + countZero < length) {
                arr[i + countZero] = arr[i];
            }
        }
        return arr;
    }
}