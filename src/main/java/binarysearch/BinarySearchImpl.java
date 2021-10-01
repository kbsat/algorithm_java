package binarysearch;

public class BinarySearchImpl {
    public static void main(String[] args) {

        int[] sortedArr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};

        int idx = binarySearchRecursionVersion(sortedArr, 0, sortedArr.length - 1, 19);

        System.out.println(idx);

    }

    public static int binarySearchRecursionVersion(int[] arr, int start, int end, int target) {

        int half = (start+end) / 2;
        if(start > end){
            return -1;
        }

        if (target == arr[half]) {
            return half;
        }

        if (arr[half] < target) {
            return binarySearchRecursionVersion(arr, half + 1, end, target);
        }else{
            return binarySearchRecursionVersion(arr, start, half - 1, target);
        }
    }
}
