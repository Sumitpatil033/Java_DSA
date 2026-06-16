public class selection{

    public static void slectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpoint=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpoint]>arr[j]){
                    minpoint=j;
                }
            }
            int temp=arr[minpoint];
            arr[minpoint]=arr[i];
            arr[i]=temp;
        }
        
            }
            public static void print(int arr[]){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        slectionsort(arr);
        print(arr);

    }
}