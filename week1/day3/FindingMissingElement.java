package week1.day3;

public class FindingMissingElement {

	public static void main(String[] args) {
		int[] arr = {1,4,3,2,8,6,7};
		
		for(int i=0;i<arr.length-1;i++) //Array sorting
		{
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
