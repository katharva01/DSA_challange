public class SelectionSort {

    // i tried quick sort but it became selection sort
    // this code below is code for that
    // time complexity : O(n**2)

    public static void selectionSort(double[] arr, int low, int high) {
        if (low < high) {
            int pivot = high;
            int l = low;
            int h = high;
            while (l < h) {
                while (arr[l] < arr[pivot]) {
                    l++;
                }

                if (l < h) {
                    double temp = arr[l];
                    arr[l] = arr[h];
                    arr[h] = temp;
                    l++;

                }

            }
            double temp = arr[pivot];
            arr[pivot] = arr[h];
            arr[h] = temp;

            selectionSort(arr, low, h - 1);
        }
    }

    public static void main(String[] args) {
        double[] arr = new double[] { 52,25,5,25,27,85,61,75,6,17,12,12,32,45,31,78,90,43,23,900 };
        selectionSort(arr, 0, arr.length - 1);
        System.out.println("The array after sorting is : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.printf(" %f ", arr[i]);
        }
        System.out.println();
    }

}
