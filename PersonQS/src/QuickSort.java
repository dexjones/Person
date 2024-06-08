public class QuickSort {
    //quickSort for ints
    public static void quickSort(int[] A, int left, int right) {
        if (left < right) {
            int pivot = partition(A, left, right); // Partition the array and get pivot index
            // recursively sort elements before and after partition
            quickSort(A, left, pivot - 1);
            quickSort(A, pivot + 1, right);
        }
    }

    public static int partition(int[] A, int left, int right) {
        int pivot = A[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (A[j] <= pivot) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    //quickSort for Strings
    public static void quickSort(String[] A, int left, int right) {
        if (left < right) {
            int pivot = partition(A, left, right); // Partition the array and get pivot index
            // recursively sort elements before and after partition
            quickSort(A, left, pivot - 1);
            quickSort(A, pivot + 1, right);
        }
    }

    public static int partition(String[] A, int left, int right) {
        String pivot = A[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (A[j].compareTo(pivot) <= 0) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, right);
        return i + 1;
    }

    public static void swap(String[] A, int i, int j) {
        String temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
