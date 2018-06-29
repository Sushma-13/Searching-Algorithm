package binarysearch;
/**
 * @author SUSHMA
 */
import java.util.*;
public class BinarySearch {
    static int binary_search(int[] a,int ele,int front,int end){
        if(front<=end){
        int mid=((end-front)/2)+front;
        if(a[mid]==ele)
            return mid;
        if(ele<a[mid]){
           return binary_search(a, ele, front,mid-1);
        }
        else{
          return  binary_search(a, ele,mid+1,end);
        }
        }
         return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to search");
        int ele=sc.nextInt();
        Arrays.sort(a);
        int loc=binary_search(a, ele,0,a.length-1);
        System.out.println("The element "+ele+" is present at location "+loc);
    }
    
}
