public class second_smallest {
    public static void main(String[] args){
    int [] arr={10,20,30,50,40,90};
 
        int smallest=arr[0];
  int second_smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest)
                smallest=arr[i];
            else if(arr[i]>smallest && arr[i]<second_smallest)
                second_smallest=arr[i];

        }
        System.out.println(smallest);
        System.out.println(second_smallest);

;    }
}
