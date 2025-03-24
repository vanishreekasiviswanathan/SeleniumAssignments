package week1.day4;

public class RemoveDuplicateTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		String str[] = text.split(" ");
		boolean isDuplicate = false;
		for(int i = 0; i<str.length-1; i++)
		{
			for(int j = i+1; j<str.length; j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					str[j] = "";
					isDuplicate = true;
				}
			}
		}
		if(isDuplicate)
		{
			for(int i=0;i<str.length;i++)
			{
			System.out.print(str[i]+" ");
			}
		}
	}

}
