// array implementation of heap

public class Heap
{   int hep[]=new int[100];
    int size = 0;
    
    public Heap(int[] arr){
        int temp=arr.length-1;
        while(temp>=0){
            int i=arr.length-temp-1;
            hep[i]=arr[i];
            size++;
            while(i!=0){
                if(hep[(i-1)/2]<hep[i]){
                    
                    // swap(hep[(i-1)/2],hep[i]);
                    
                    int t =hep[(i-1)/2];
                    hep[(i-1)/2]=hep[i];
                    hep[i]=t;
                }
                 i=(i-1)/2;
            }
            temp--;
        }
    }
    
    // public static int swap(int i,int j){
    //     int t =i;
    //     i=j;
    //     j=t;
    //     return 0;
    // }
    
    public int insert(int key){
        hep[size]=key;
        int temp = size;
        size++;
        
        while(hep[temp]>hep[(temp-1)/2])
        {   
            int swa = hep[temp];
            hep[temp]=hep[(temp-1)/2];
            hep[(temp-1)/2]=swa;
            
            temp = (temp-1)/2;
        }
        
        return temp;
    }
    
    public int delete(){
          int swa = hep[0];
          hep[0]=hep[size-1];
          hep[size-1]=swa;
          size--;
          int i =0;
          int parent=i;
          int child=0;
          if(hep[2*i+1]>hep[2*i+2]){
            child=2*i+1 ;
          }
          else{
            child=2*i+2;
          }
          while(hep[parent]<hep[child]){
            
            int swa2 = hep[parent];
            hep[parent]=hep[child];
            hep[child]=swa2;
            parent=child;
            if(hep[2*parent+1]>hep[2*parent+2]){
                child=2*parent+1 ;
              }
              else{
                child=2*parent+2;
              }
          }
         

	  return hep[size];  
    }

    
	public static void main(String[] args) {
	    int[] a= new int[]{22,34,44,55,67,66,89,32,21,34};
	    Heap h1 = new Heap(a);
	    for(int j=0;j<h1.size;j++){
		System.out.printf("%d %n",h1.hep[j]);
	    }
	    System.out.printf("size of heap is %d %n",h1.size);
	    System.out.printf("key is inserted at  %d %n",h1.insert(64));
	    System.out.printf("size of heap is %d %n",h1.size);
	     for(int j=0;j<h1.size;j++){
		System.out.printf("%d %n",h1.hep[j]);
	    }
        System.out.printf("element deleted is  %d %n",h1.delete());
	    System.out.printf("size of heap is %d %n",h1.size);
	     for(int j=0;j<h1.size;j++){
		System.out.printf("%d %n",h1.hep[j]);
	    }
	}
	
	
}
