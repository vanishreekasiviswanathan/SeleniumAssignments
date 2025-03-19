package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 1001, output = 0;
		for(int temp = input; temp!=0 ; temp = temp/10)
		{
			output = (output*10) + (temp%10);
		}
		if(output == input)
			System.out.println("The given number is Palindrome");
		else
			System.out.println("The given number is not Palindrome");
	}

}
