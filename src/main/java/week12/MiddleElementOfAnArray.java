package week12;

public class MiddleElementOfAnArray {

    public String getMiddleElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if (arr.length % 2 == 1) {
            return "" + arr[arr.length / 2];  // 9/2 = 4   1,2,3,4,5,6,7,8,9
        } else if (arr.length != 0) {
            return arr[(arr.length / 2) - 1] + " and " + arr[arr.length / 2]; // 10/2=5    1,2,3,4,5,6,7,8,9,10
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        MiddleElementOfAnArray middleElementOfAnArray = new MiddleElementOfAnArray();

        int arr1[] = {2, 16, 15, 4, 12, 65, 3};
        String result1 = middleElementOfAnArray.getMiddleElement(arr1);
        System.out.println(result1);

        int arr2[] = {2, 16, 15, 4, 12, 65, 3, 9};
        String result2 = middleElementOfAnArray.getMiddleElement(arr2);
        System.out.println(result2);
    }
}
