public class SortArray {

	public static void main(String[] args) {
		 System.out.print("enter the size of array :");
		 int size = Input.getInt();
		 int[] arr = new int[size];
		 System.out.println("enter the elements of array : ");
		 for(int i=0; i<size; i++) {
			 arr[i] =Input.getInt();
		 }
     for(int i=0; i<size-1; i++) {
    	 for(int j=0; j<size-1-i; j++) {
    		 if(arr[j]>arr[j+1]) {
    		  int temp = arr[j];
    			arr[j] = arr[j+1];
    			 arr[j+1] = temp;
   }
     }
    	 }
     System.out.println("sorted array will be :");
     for(int i=0; i<size; i++) {
    	 System.out.print(arr[i]+" ");
     }
	}

}
