
//finding the no.of 7's
public class practice {
    public static void count(int n[][],int key){
        int count=0;
       for(int i=0;i<n.length;i++){
        for(int j=0;j<n[0].length;j++){
        if(n[i][j]==key){
           count++;
        }
        }
       }
       System.out.println(count);
      
    }
    public static void main(String[] args) {
        int n[][]={{2,7,8},{8,9,7}};
        int key=7;
        count(n, key);
    }
}
