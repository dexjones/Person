import java.util.Comparator;

public class QuickSort {
    // quickSort for descending order
    public static <T> void quickSortDescend(T[] A, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int pivot = partitionDescend(A, left, right, comparator);
            quickSortDescend(A, left, pivot - 1, comparator);
            quickSortDescend(A, pivot + 1, right, comparator);
        }
    }

    private static <T> int partitionDescend(T[] A, int left, int right, Comparator<T> comparator) {
        T pivot = A[right];
        int i = left - 1;
        for (int j = left; j <= right - 1; j++) {
            if (comparator.compare(A[j], pivot) >= 0) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, right);
        return i + 1;
    }
    public static <T> void swap(T[] A, int i, int j) {
        T temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    // quickSort for ascending order
    public static <T> void quickSortAscend(T[] A, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int pivot = partitionAscend(A, left, right, comparator); // Partition the array and get pivot index
            // recursively sort elements before and after partition
            quickSortAscend(A, left, pivot - 1, comparator);
            quickSortAscend(A, pivot + 1, right, comparator);
        }
    }

    public static <T> int partitionAscend(T[] A, int left, int right, Comparator<T> comparator) {
        T pivot = A[right];
        int i = left - 1;
        for (int j = left; j <= right - 1; j++) {
            if (comparator.compare(A[j],pivot) <= 0) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, right);
        return i + 1;
    }

}
