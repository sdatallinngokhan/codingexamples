package week12;

public class SecondBiggestOfAnArray {

    public int getSecondBiggest(int[] arr) {

        if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[1];
    }

    public static void main(String[] args) {
        SecondBiggestOfAnArray secondBiggestOfAnArray = new SecondBiggestOfAnArray();

        int[] arr = {2, 16, 15, 4, 12, 65};
        int result = secondBiggestOfAnArray.getSecondBiggest(arr);

        System.out.println(result);
    }
}
