public class First_occurance{
    public static int first_occurance(int arr[],int n,int key){
        if(n==arr.length){
            return -1;
        }
        if(arr[n]==key){
            return n;
        }
        return first_occurance(arr, n+1, key);
    }
    public static void main(String args[]){
        int arr[]={3,4,6,7,8,9};
        System.out.println(first_occurance(arr, 0, 7));
    }
}