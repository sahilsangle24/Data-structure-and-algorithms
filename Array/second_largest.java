public class second_largest {
    public static void main(String[] args){

        int [] arr={20,10,50,90,44,39,88};
        int largest=arr[0];
        int second_largest=Integer.MIN_VALUE;;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
            else if(arr[i]<largest && arr[i]>second_largest){
                second_largest=arr[i];
            }
        }
        
        System.out.println(largest);
        System.out.println(second_largest);
    }
}
