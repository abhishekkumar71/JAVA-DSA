public class searchinsortedrotatedarray {
    public static int search(int arr[],int tar,int si,int ei){
        if (si>ei) {
            return -1;
        }
        int mid=si+(ei-si)/2;

        if (arr[mid]==tar) {
            return mid;
        }
        
        //MID ON L1
        if (arr[si]<=arr[mid] ) {
            
            //CASE a: LEFT
            if (arr[si]<=tar && tar<=arr[mid]) {
                return search(arr, tar,si, mid-1);
            }
            //CASE b: RIGHT
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        //MID ON L2
        else{
            //CASE c:RIGHT
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }
            else{
                //CASE d:LEFT
                return search(arr, tar, si, mid-1);

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        System.out.println(search(arr, tar,0, arr.length-1));
    }
}
