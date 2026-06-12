public class largest {

    public static int larrgenumber(int[] array){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,7,5,4,3,9};
        System.out.println("maximum is" + larrgenumber(array));
    }
}
