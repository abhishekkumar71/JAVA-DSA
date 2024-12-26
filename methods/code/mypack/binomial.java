package code.mypack; 
public class binomial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
public static void main(String[] args) {
int n=10,r=7,nmr=n-r;
int nfact=fact(n);
int rfact=fact(r);
int nmrfact=fact(nmr);
System.out.println(nfact);
System.out.println(rfact);
System.out.println(nmrfact);
int bincoef=nfact/(rfact*nmrfact);
System.out.println(bincoef);

}
}