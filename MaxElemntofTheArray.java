
public class MaxElemntofTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={20,30,11,4,65,111,99};
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] != max){
                sec_max=Math.max(sec_max,arr[i]);
            }
        }
        System.out.println("Max="+max);
        System.out.println("Second Max="+sec_max);
	}

}
