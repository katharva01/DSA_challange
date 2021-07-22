
public class SortByRatio {
    public static void sortByRatio(double[][] arr) {
        int k = 0;

        for (int j = k; j < arr[0].length; j++) {
            int temp = j;
            for (int i = k; i < arr[0].length; i++) {
                if (arr[0][i]/arr[1][i] > arr[0][temp]/arr[1][temp]) {
                    temp = i;
                }
                
            }
            double swap = arr[0][k];
                arr[0][k] = arr[0][temp];
                arr[0][temp] = swap;

                swap = arr[1][k];
                arr[1][k] = arr[1][temp];
                arr[1][temp] = swap;
                k++;
        }
    }

    public static void printTwoDArray(double[][] arr){
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] arr = new double[][] { {24,44,69,21,12,35,5,36}, {8,11,23,7,2,7,1,6 } };
        System.out.println("Array before sorting : ");
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        sortByRatio(arr);
        System.out.println("Array After sorting : ");
        printTwoDArray(arr);
    }
}

