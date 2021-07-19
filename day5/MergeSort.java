
import java.lang.Math;

class MergeSort{
    static int count=1;
    public static void merge(double[] arr,int start,int mid,int end){
        // mid is index of last element in left sub array.
        int size1 = mid-start+1;
        int size2 = end-mid;

        double leftArr[]=new double[size1];
        double rightArr[]=new double[size2];
        
        for(int i=0;i<size1;i++){
            leftArr[i]=arr[start+i];
        }
        for(int i=0;i<size2;i++){
            rightArr[i]=arr[mid+1+i];
        }

        // i,j,k are iteration variables of arrays leftArr,rightArr,and arr.
        int i=0,j=0,k=start;
        while(i<size1 && j<size2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else if(leftArr[i]>rightArr[j]){
                arr[k]=rightArr[j];
                j++;
            }
            k++;
            
            
        }
            while(i<size1){
                arr[k]=leftArr[i];
                i++;k++;
            }
            while(j<size2){
                arr[k]=rightArr[j];
                j++;k++;
            }

        }

        public static void iterativeMergeSort(double[] arr){
            // size is storing the lenth of sorted list which we are going to merge
            int size =1;
            while((int)Math.pow(2, size-1)<arr.length)
            {
                int start=0,mid=((int)Math.pow(2, size-1))-1,end=(int)Math.pow(2, size)-1;

                // for merging 2 sublists for arrayLength/2**size times 
                for(int i=0;i<(arr.length)/Math.pow(2, size);i++){
                    if(end<arr.length){
                   
                    merge(arr,start,mid,end);
                 
                    start=start +(int)Math.pow(2, size);
                    mid=mid+(int)Math.pow(2, size);
                    end=end+(int)Math.pow(2, size);
                }
                }
               
                
                size++;
            }
            }
        
            public static void mergeSort(double[] arr,int start,int end){

                if(start<end){
                   int mid=(start+end)/2;
                    mergeSort(arr, start, mid);
                    mergeSort(arr, mid+1, end);
                    merge(arr,start,mid,end);
                }
            }
        

    

    public static void main(String[] args) {
        double[] a =new double[]{555,85,5,87,56,67,252,48,9,7,32,3,45,6,788,65,3,4676,43,445,90,900};
        iterativeMergeSort(a);
        // mergeSort(a,0,8);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


}