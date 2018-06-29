package linearsearch;
/**
 *
 * @author SUSHMA
 */
import java.util.*;
public class LinearSearch {
    static int LinearSearch(int[]a,int ele){
        for(int i=0;i<a.length;i++){
            if(a[i]==ele)
                return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]a={40,50,98,54,75,63,46,25,96,35,31,25};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to search");
        int n=sc.nextInt();
        int loc=LinearSearch(a,n);
        System.out.println("the element "+n+" is found at position "+loc);
    }
    
}
