package week1.day3;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
					System.out.println(nums[i]);
			}
		}

	}

}
