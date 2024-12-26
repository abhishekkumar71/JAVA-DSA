public class prime2 {
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                System.out.println(" not a prime number");
             break;
            }
            else{
                System.out.println(" prime number");
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(isprime(13));
    }
}
