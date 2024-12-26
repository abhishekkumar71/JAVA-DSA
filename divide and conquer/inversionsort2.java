public class inversionsort2 {
    public static void inversionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (j > i) {

                    if (arr[i] > arr[j]) {
                        System.out.println("(" + arr[i] + "," + arr[j] + ")");
                    }
                }
               
                }
               
                } 
               
            }
            
          
        
    

    public static void main(String[] args) {
        int arr[] = { 1,5,2,3,4,6 };
        inversionsort(arr);
    }
}
