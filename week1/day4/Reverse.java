package week1.day4;

public class Reverse {

	public static void main(String[] args) {
		String name = "Vanishree";
		char[] charArr = name.toCharArray();
		String rev = "";
		for (int i = charArr.length-1; i >= 0; i--) {
			rev = rev + charArr[i];
		}
		System.out.println(rev);

	}

}
