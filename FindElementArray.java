import java.util.*;
public class FindElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target element:");
		int x=sc.nextInt();
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==x) {
				flag=true;
				break;
			}
		}
		if(flag==true) System.out.println("Element found");
		else System.out.println("Element not found.");
	}

}
