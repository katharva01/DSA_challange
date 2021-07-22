
public class JobScheduling {

    public static double schedule(double[][] arr,int slots){
        TwoDSort.sort(arr);
        // TwoDSort.printTwoDArray(arr);

        double profit=0;
        boolean[] check = new boolean[slots];
        int count=slots;
        for(int i=0;i<arr[1].length;i++){
            if(arr[1][i]<=slots && count>0){
                for(int j=(int)arr[1][i]-1;j>=0;j--){
                    if(check[j] == false){
                        profit=profit+arr[0][i];
                        count--;
                        check[j]=true;
                        break;
                    }
                }
            }
        }

        return profit;
    }
    
    
    
    public static void main(String[] args) {
        double[][] arr = new double[][] { { 20, 1, 10, 5,8,15,9, 2 }, { 2, 3, 1,3,4, 2, 3, 4 } };
        System.out.println("The profit and scheduling limit is :");
        TwoDSort.printTwoDArray(arr);
        System.out.println();
        System.out.printf("The maximum profit after scheduling given jobs is : %f %n",schedule(arr,4)) ;
        // TwoDSort.printTwoDArray(arr);

    }
    
}
