public class Main{
    public static void main(String[]args){
        int arr[] = {1,3,5,7,8,9,10,15};
        
        
        int key = 9;
        int start= 0;
        int end = arr.length-1;
        boolean found = false;
        while(start<=end){
           int   mid = start +(end -start )/2;
            
            if(arr[mid]==key){
                System.out.println("The element found at index : "+ mid);
               found = true;
                break;
            }
            
            else if(arr[mid]>key){
                end= mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
       if(!found){
           System.out.println("The element is not found");
       }
       
    }
}
