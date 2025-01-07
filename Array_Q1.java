import java.util.*;
public class Array_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks= {30,45,62,33,18};
		System.out.println("The roll numbers having mark < 35 are: ");
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<35) 
				System.out.println(i);
		}
	}

	}
