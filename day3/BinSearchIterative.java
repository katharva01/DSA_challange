
public class BinSearchIterative
{
    public static int binarySearch(Double A[],int n,Double key){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
        if(key.equals(A[mid])){
            return mid;
        }
        if(key<A[mid]){
            high=mid-1;
        }
        if(key>A[mid]){
            low=mid+1;
        }
        }
        return -1;
        
    }
    
    
	public static void main(String[] args) {
	   
	    Double[] arr={21.0,23.3,34.8,45.7,56.9,78.9,87.8,89.6,90.7,99.99,121.0,134.54,156.3};
	    Double key=23.3;
	    int index=binarySearch(arr,13,key);
	    System.out.printf("index of key %f is ",key);
	    System.out.println(index);
	
	}
}
