
public class ArrayListAlgo {

    public static void main(String[] args) {

        // bubbleSort();
        // selectionSortBySwaping();
        // insertionSort();
        // int[] arr = {9, 5, 6, 3, 8, 7, 2, 1};
        // quickSort(arr, 0, arr.length - 1);
        // for (Object aObject : arr) {
        //     System.out.println(aObject);
        // }
        // countingSort();
        redixSort();

    }

    // find smallest element in array
    public static void smallestElement() {
        int[] arr = {3, 5, 8, 5, 9, 6, 2};
        int smallestelement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (smallestelement > arr[i]) {
                smallestelement = arr[i];
            }
        }
        System.out.println(smallestelement);
    }

    // bubble sort algorithm
    public static void bubbleSort() {
        int[] b_arr = {3, 1, 9, 4, 3, 2, 5, 7};

        // System.out.print("b_arr" + b_arr.length );
        // int shorted_Arr = b_arr[0];
        for (int i = 0; i < b_arr.length - 1; i++) {
            for (int j = 0; j < b_arr.length - 1 - i; j++) {
                int lenght = b_arr.length - 1 - i;
                System.out.print("j " + lenght + ",");
                if (b_arr[j] > b_arr[j + 1]) {

                    int temp = b_arr[j];
                    b_arr[j] = b_arr[j + 1];
                    b_arr[j + 1] = temp;
                }

            }
        }
        // for (int i : b_arr) {
        //     System.out.println(i);
        // }

    }

    // Selection sort algorith by shifting
    public static void selectionSortbyShifting() {
        int[] arr = {8, 3, 5, 6, 9, 12, 4, 34, 2, 6, 1};
        int[] min_arr = new int[arr.length];
        for (int i = 0; i < min_arr.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < min_arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int min_value = arr[min_index];

            for (int k = min_index; k > i; k--) {
                arr[k] = arr[k - 1];
            }
            arr[i] = min_value;
        }

        for (int m : arr) {
            System.out.println(m);
        }
    }

    // Selection sort algorithm by swaping
    public static void selectionSortBySwaping() {
        int[] arr = {8, 3, 5, 6, 9, 12, 4, 34, 2, 1};
        int[] n_arr = new int[arr.length];

        for (int i = 0; i < n_arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n_arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    int temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }

        for (int m : arr) {
            System.out.println(m);
        }
    }

    // Insertion Sort algorithm
    public static void insertionSort() {
        int[] arr = {8, 4, 6, 7, 9, 3, 2, 1};

        for (int i = 1; i < arr.length; i++) {
            int initialStart = i;
            int currentValue = arr[initialStart];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                initialStart = j;
                j--;
            }
            arr[initialStart] = currentValue;

        }
        for (Object c : arr) {
            System.out.println(c);
        }

    }

    // Quick Sort algorithm
    public static void quickSort(int[] arr, int start, int last) {
        if (start < last) {
            int pivotElement = pivotion(arr, start, last);
            quickSort(arr, pivotElement + 1, last);
            quickSort(arr, start, pivotElement - 1);
        }
    }

    public static int pivotion(int[] arr, int start, int last) {
        int pivot = arr[last];
        int i = start - 1;

        for (int j = start; j < last; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = temp;

        return i + 1;
    }

    // Counting Sort
    public static void countingSort() {
        int[] arr = {4, 6, 3, 6, 4, 1, 5, 3, 4};
        int max = arr[0];

        // find max value of arr
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // System.out.println("max value "+max);

        int[] n_arr = new int[max + 1];

        for (int nar : arr) {
            n_arr[nar] = n_arr[nar] + 1;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (n_arr[i] > 0) {
                arr[index++] = i;
                n_arr[i]--;
            }
        }

        for (Object sortedArr : arr) {
            System.out.println(sortedArr);
        }
    }

    // Redix sort
    public static void redixSort() {
        int[] arr = {35, 56, 34, 67, 23, 18, 15, 89, 90, 56};
        int[][] redixArr = new int[10][arr.length];
        int[] counts = new int[10];
        int max = arr[0];
        int exp = 1;

        // find max value of arr
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        while (max / exp > 0) { 
            for (int val : arr) {
                int redixIndex = (val / exp) % 10;
                redixArr[redixIndex][counts[redixIndex]] = val;
                counts[redixIndex]++;
            }
            int pos = 0;
            for (int i=0; i<10; i++) {
                for (int j = 0; j < counts[i]; j++) {
                    arr[pos] = redixArr[i][j];
                    pos++;
                }
                counts[i] = 0;
            }
            exp *= 10;
        }


        for (int sval : arr) {
            System.out.println("sorted value" + sval);
        }

    }

}
