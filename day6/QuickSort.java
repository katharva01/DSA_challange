


public class QuickSort {
    // this two count variables are there only for sake of
    // counting the number of times while loops in 
    //partion algorithem executes which helps us understand 
    // time complexity of the algorithem.
    // which is , in best case : O(nlogn)
    // worst case(input array is already sorted):O(n**2)
    // 
    // static int count=0;
    // static int count1=0;

    public static int partition(double[] arr,int low,int high){
    int pivot = low;int l=low+1;int h=high;
    while(l<=h){
    while( arr[l]<=arr[pivot]){
    l++;
    // count++;
    }
    
    while( arr[h]>arr[pivot]){
    h--;
    // count1++;
    }

    if(l<h){
    double temp= arr[l];
    arr[l]=arr[h];
    arr[h]=temp;
    }
    }
    
    double temp= arr[pivot];
    arr[pivot]=arr[h];
    arr[h]=temp;
    
    return h;
    }

    public static void quickSort(double[] arr, int low, int high) {

        if (low < high) {
            int pivot = partition(arr, low, high);

            System.out.println();
            quickSort(arr, low, pivot - 1);
            
            quickSort(arr, pivot + 1, high);

        }
    }

    public static void main(String args[]) {
        double[] arr = new double[] { 52,25,5,25,85,61,75,6,17,12,12,32,45,31,78,90,43,23,900 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("The array after sorting is : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.printf(" %f ", arr[i]);
        }
        System.out.println();
        // System.out.println(count+ " "+count1);
    }

}
