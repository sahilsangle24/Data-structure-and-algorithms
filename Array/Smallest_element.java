public class Smallest_element {
  public static void main(String[] args){
    int[] arr={90,70,30,20,10,40,88};
    int smallest=arr[0];
  
    for(int i=1;i<arr.length;i++){
        if(arr[i]<smallest)
        smallest=arr[i];
    }
    System.out.println(smallest);


  }  
}
