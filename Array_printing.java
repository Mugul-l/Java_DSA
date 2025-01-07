import java.util.*;
public class Array_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter numbers-");
        
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

	}

}
