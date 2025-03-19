package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int p = 21;
		boolean flag = true;
		for(int i=2;i<=p/2;i++)
		{
			if(p%i==0)
			{
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Given number is  a Prime NUmber");
		}
		else {
			System.out.println("Given number is not a Prime NUmber");
		}
	}

}
