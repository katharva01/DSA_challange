

public class Heap {
    double[] heap ;
    // size variable is used store the number of positions that are used by heap from overall capacity of heap
    int size =0;

    public static boolean isleaf(double[] arr,int node,int siz){
        if(node<siz/2){
            return false;
        }else{
            return true;
        }
    }

    public static int leftChildIndex(int parent){
        return (2*parent+1);
    }

    public static int rightChildIndex(int parent){
        return (2*parent+2);
    }

    public static int parentOf(int child){
        return ((child-1)/2);
    }
    

    public static void heapify(double arr[],int parent,int siz){
        
        if(isleaf( arr,parent,siz)){
            return ;
        }
        
        int child=parent ;

        // if leftchild is grater than parent then child=leftChild
        if(leftChildIndex(parent)<siz && arr[child]<arr[leftChildIndex(parent)] ){
            child=leftChildIndex(parent);
        }

        // if rightchild is grater than parent then child=rightChild
        if(rightChildIndex(parent)<siz && arr[child]<arr[rightChildIndex(parent)]  ){
            child=rightChildIndex(parent);
        }
        
        // if child value is changed from parent to any other value then definitely child is grater than parent
        // so we swap child and parent
        if(child!=parent){
            double temp=arr[child];
            arr[child]=arr[parent];
            arr[parent]=temp;
            
            //after swapping we check and heapify new child node  
            heapify(arr,child,siz);
            
        }

    }

    public Heap(double[] arr,int limit){
        heap=new double[limit];
        System.arraycopy(arr, 0, heap, 0, arr.length);;
        size = arr.length;
         
        for(int i= (size/2-1);i>=0;i--){
            
            heapify(heap,i,size);
            
        } 
    } 

    public int insert(double num){
        if(size<heap.length){
            heap[size++]=num;
            int parent=parentOf(size-1);
            int child=size-1;
            while(parent>=0 && heap[parent]<heap[child]){
                double temp = heap[parent];
                heap[parent]=heap[child];
                heap[child]=temp;

                child = parent;
                parent = parentOf(child);
 
            }
            return child;
        }
        return -1;
    }

    public double delete(){
       
        if(size>1){
        double temp = heap[0];
        heap[0]=heap[size-1];
        heap[size-1]=temp;
        }

        size--;
        heapify(heap, 0, size);
        return heap[size];
        
        
    }

    public static double[] heapSort(double[] arr){
        Heap h=new Heap(arr,arr.length);
        for(int i=h.size;i>0;i--){
            h.delete();
        }
        return h.heap;
    }

    public static void main(String[] args) {
        double[] arr = new double[]{2523,202,63,991};
        arr=heapSort(arr);
        System.out.print("The sorted array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Heap h1=new Heap(arr,100);
        for(int i=0;i<h1.size;i++){
            System.out.print(h1.heap[i]+" ");
        }
        System.out.println();

        System.out.println("added at index: " +h1.insert(888));
        
        for(int i=0;i<h1.size;i++){
            System.out.print(h1.heap[i]+" ");
        }
        System.out.println();

        System.out.println(h1.delete()+ " is deleted");
        
        for(int i=0;i<h1.size;i++){
            System.out.print(h1.heap[i]+" ");
        }
        System.out.println();
    }
}
