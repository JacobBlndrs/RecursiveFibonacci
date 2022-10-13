public class Fibonacci {
    static int Fibo(int n){
        if (n==1) return 1;
        if (n==0) return 1;

        return Fibo(n-1)+Fibo(n-2);


    }


    public static void main(String[] args) {

        System.out.println(Fibo(9));
    }
}
