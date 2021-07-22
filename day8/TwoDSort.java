// this sorting technique is useful in sorting jobs
// according to profit in job scheduling problem

class TwoDSort {
    public static void sort(double[][] arr) {
        int k = 0;

        for (int j = k; j < arr[0].length; j++) {
            int temp = j;
            for (int i = k; i < arr[0].length; i++) {
                if (arr[0][i] > arr[0][temp]) {
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
        double[][] arr = new double[][] { { 20, 15, 10, 5,8,1,9, 22 }, { 2, 2, 1,3,4, 3, 3, 4 } };
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        sort(arr);
        printTwoDArray(arr);
    }
}