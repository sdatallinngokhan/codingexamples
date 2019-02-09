package week12;

public class LCMFinder {

    public int getLCM(int arr[]) {
        int LCM = 1;

        for (int j = 2; j < Integer.MAX_VALUE; j++) { // is used to have prime numbers by if check to divide array elements
            if (isPrime(j)) {
                for (int k = 0; k < arr.length; k++) { // is used to check whether an element of array can be divided by that step's prime number
                    if (arr[k] % j == 0) {
                        LCM = LCM * j;
                        for (int t = 0; t < arr.length; t++) { // is used if an element of array can be divided by the prime, then divide it
                            if (arr[t] % j == 0) {
                                arr[t] = arr[t] / j;
                            }
                        }

                        for (int t = 0; t < arr.length; t++) { // is used whether that step's prime number should be re-used
                            if (arr[t] % j == 0) {
                                j--;
                                break;
                            }
                        }
                        break;
                    }
                }

                boolean isAll1 = true;
                for (int k = 0; k < arr.length; k++) { // is used to check all elements of array reached to lowest value(which is 1)
                    if (arr[k] != 1) {
                        isAll1 = false;
                        break;
                    }
                }

                if (isAll1) {
                    break;
                }
            }
        }

        return LCM;
    }

    public boolean isPrime(int number) {

        if (number == 2) return true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LCMFinder lcmFinder = new LCMFinder();

        int arr[] = {5, 8, 10, 7};
        int result = lcmFinder.getLCM(arr);

        System.out.println(result);
    }
}
