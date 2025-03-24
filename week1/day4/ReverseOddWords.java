package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] newTest= test.split(" ");
		for(int i = 0; i<newTest.length; i++)
		{
			if(i%2 != 0)
			{
				String temp = "";
				for(int j = newTest[i].length()-1; j>=0; j--)
				{
					temp = temp + newTest[i].charAt(j);
				}
				newTest[i] = temp;
			}
			System.out.print(newTest[i]+" ");
		}
	}

}
