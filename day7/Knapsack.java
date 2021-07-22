

public class Knapsack{
    public static double fillSack(double[][] arr,double capacity){
        SortByRatio.sortByRatio(arr);
        double profit=0;
        for(int i=0;i<arr[1].length;i++){
            if(arr[1][i]<=capacity){
                profit=profit+arr[0][i];
                capacity=capacity-arr[1][i];
            }
            else if(arr[1][i]>capacity){
                profit=(capacity/arr[1][i])*arr[0][i]+profit;
                capacity=0;
            }
            
            if(capacity==0){break;}
        }
        
        return profit;
    }

    public static void main(String[] args) {
        double[][] arr = new double[][] { {24,44,20,21,12,35,5,36}, {8,11,8,7,2,7,1,6 } };
        System.out.printf("Maximum profit after filling given items %naccording to capacity of knapsack is : %f",fillSack(arr,30));
    }
}