public class Print_Increasing{
    public static void increase(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        increase(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n=10;
        increase(n);
    }
}