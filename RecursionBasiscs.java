public class RecursionBasiscs {
    public static void printDec(int n){
        if(n==10){
            System.out.println(n);
            return ;
        }
        System.out.print(n+" ");
        printDec(n+1);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1= fact(n-1);
        int fn= n*fact(n-1);
        return fn;
    }
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int sum1= calcSum(n-1);
        int sn= n+ sum1;
        return sn;
    }
    //fibonacci series
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1); //1
        int fnm2= fib(n-2);  //2
        int fn= fnm1 + fnm2;
        return fn;
    }
    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key , i+1);
    }
    public static int power(int x, int n){
    if(n == 0){
        return 1;
    }
//    int xnm1=power(x,n-1);
//    int xn= x * xnm1;
//    return xn;
        return x * power(x,n-1);
    }
    public static void main(String args[]){
//        int arr[]={8,3,6,9,5,10,2,5,3};
        int n=1;
        printDec(n);
        System.out.println();
        System.out.println(fact(5));
        System.out.println(calcSum(5));
        System.out.println(fib(23));
//        System.out.println(firstOccurence(arr, 5,0));
        System.out.println(power(2,10));
    }
}
