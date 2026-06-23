public class recusivefact {

    public static int fact(int n){
        if(n==1){
            
             return n;
        }

        n= n * fact(n-1);
        
        return n;
    }
    public static void main(String[] args) {
        int n=5;
       System.out.println(fact(n));
    }
}
