public class Tilling_Problem{
    public static int tilling(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm=tilling(n-1);
        int fnm2=tilling(n-2);
        int totways=fnm+fnm2;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(tilling(10));
    }
}