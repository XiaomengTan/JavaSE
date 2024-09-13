public class Case005ChargeTheArr {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};

        boolean comp = compare(arr, arr2);

        System.out.println(comp);
    }

    public static boolean compare(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

