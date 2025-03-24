package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt1 = "stops";
		String txt2 = "posts.";
		if(txt1.length() == txt2.length())
		{
	
			char[] ch1 = txt1.toCharArray();
			char[] ch2 = txt2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag = true;
			for(int i = 0; i<ch1.length; i++)
			{
				if(ch1[i]!=ch2[i])
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("The given strings are Anagram");
			else
				System.out.println("The given strings are not Anagram");
		}
		else{
		System.out.println("Length mismatch, the strings are not anagram");
		}	
	}

}
