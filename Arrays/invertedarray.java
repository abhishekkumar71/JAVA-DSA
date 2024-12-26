public class invertedarray {
    public static void invert(int arr[], int pi){
        int temp=arr[0];
     for(int i=0;i<arr.length-1;i++){
      arr[i+1]=arr[pi+1];
      arr[i]=temp;
     }
     System.out.println(arr +" ");
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,4,5,6,7};
        int pi=3;
        invert(arr, pi);
    }
}
