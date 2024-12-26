import java.util.*;

public class practice {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=65,c=1,count=1,sum;
        for(int i=1;i<=n;i++){
            a=65;
            c=1;
            sum=n+1;
            if(i==1){
                count=1;
            }
            else{
                count+=2;
                for(int j=1;j<n*2;j++){
                    if(i+j==sum && c<=count){
                        if(i+j<n+i){
                            System.out.printf("%c",a);
                            a++;
                            sum++;
                            c++;
                        }
                        else{
                            a--;
                            System.out.printf("%c",a-1);
                            sum++;
                            c++;
                        }
                    }
                    else{
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}