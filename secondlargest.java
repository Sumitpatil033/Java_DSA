public class secondlargest {

    public static int second(int arr[]){
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max2=max;
                max=arr[i];

               
            }
             else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,5,8,6,7,9};
        System.out.println(second(arr));
    }
}
