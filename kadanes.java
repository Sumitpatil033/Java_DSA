public class kadanes {

    public static int maxsum(int numbers[]){
        int max=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<numbers.length;i++){
            currentsum=currentsum+numbers[i];
            if(currentsum<0){
                currentsum=0;
            }
            if(currentsum>max){
                max=currentsum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Max Subarray Sum = " + maxsum(numbers));
    }
}