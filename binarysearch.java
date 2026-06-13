public class binarysearch {
        public static int binarysearchh(int number[],int key)
        {
            int start=0;
            int end=number.length-1;
            while (start<=end)
                {
                int mid=(start+end)/2;
                if(number[mid]==key)
                {
                    return mid;
                }
                if (number[mid]>key) 
                {
                    end=mid-1 ;                 
                }
                else
                {
                    start=mid+1;
                }
               
            }
            System.out.println();
            return -1;
        }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,10};
        int key=10;
       int index=binarysearchh(number,key);
       System.out.println("the index number is" + " = "  + index);
    }
}
