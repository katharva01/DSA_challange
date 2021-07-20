public class QuickSort {

    // public static int partition(double[] arr,int low,int high){
    // int pivot = low;int l=low;int h=high;
    // while(l<h){
    // while(l<high && arr[l]<arr[pivot]){
    // l++;
    // }
    // System.out.println("hw");
    // while(h>low && arr[h]>arr[pivot]){
    // h--;
    // }

    // System.out.println("hwi");
    // if(l<h){
    // double temp= arr[l];
    // arr[l]=arr[h];
    // arr[h]=temp;
    // h--;l++;
    // }
    // }
    // if(l>h ){
    // double temp= arr[pivot];
    // arr[pivot]=arr[h];
    // arr[h]=temp;
    // }
    // System.out.println(h+1);
    // return h+1;

    // }
    public static int partition(double[] arr, int low, int high) {
        int pivot = high;
        int l = low;
        int h = high;
        while (l < h) {
            while (arr[l] < arr[pivot]) {
                l++;
            }
            System.out.println(h + "#" + l);

            while (arr[h] > arr[pivot]) {
                h--;
            }
            System.out.println(h + "$" + l);

            if (l < h) {
                double temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                System.out.println(h + "*" + l);
            }


        }
        double temp = arr[pivot];
        arr[pivot] = arr[h];
        arr[h] = temp;

        System.out.println(h + " " + l);
        return l;

    }

    public static void quickSort(double[] arr, int low, int high) {

        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);

            quickSort(arr, pivot + 1, high);

        }
    }

    public static void main(String args[]) {
        double[] arr = new double[] { 2, 343, 80, 5,345,4, 45, 344, 65,56,98, 7, 76, 2, 43, 57, 8, 86 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("The array after sorting is : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.printf(" %f ", arr[i]);
        }
        System.out.println();

    }
}
