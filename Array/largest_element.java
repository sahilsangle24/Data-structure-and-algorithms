public class largest_element {

    public static void main(String[] args){

        int [] arr={20,30,60,90,1,10,33,25};
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
           if(arr[i]>max)
            max=arr[i];

        }
        System.out.println(max);
    }
    
}
