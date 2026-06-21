// find lowest element from array 

public class ArrayList {

    public static void main(String[] args) {

        // bubbleSort();
        selectionSortBySwaping();
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
        for (int i = 0; i < min_arr.length -1; i++) {
            int min_index = i;

            for (int j = i+1; j < min_arr.length; j++) {
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            int min_value = arr[min_index];

            for (int k = min_index; k > i; k--) {
                arr[k] = arr[k-1];
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

            for (int j = i+1; j < n_arr.length; j++){
                if(arr[j] < arr[minIndex]){
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
}
