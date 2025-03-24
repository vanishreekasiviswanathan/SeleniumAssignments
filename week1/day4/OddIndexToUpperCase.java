package week1.day4;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		String newText = "";
		char[] ch = test.toCharArray();
		for(int i =0; i<test.length(); i++)
		{
			if(i%2!=0 && (test.charAt(i)>=97 && test.charAt(i)<=122)) 
			{
				newText = newText + (char)(ch[i]-32);
			}
			else
				newText  = newText + ch[i];
		}
		System.out.println(newText);
	}

}
