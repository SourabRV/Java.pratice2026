import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]a ={5,8,6,9,10};
        System.out.println("Enter your key");
        int key= sc.nextInt();
    boolean found = false;
    for(int i=0;i<a.length;i++){
        if(a[i]==key){
            System.out.println("Element found at index:"+i);
            found=true;
            break;
            
        }
    }
    if(!found){
       System.out.println("Element not found"); 
    }
    }
}
