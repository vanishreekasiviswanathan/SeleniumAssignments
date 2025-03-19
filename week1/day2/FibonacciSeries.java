package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, counter = 0;
		for(int i=-1,next=1,sum=0;counter<range;counter++)
		{
			sum = i+next;
			System.out.println(sum);
			i=next;
			next=sum;
		}

	}

}
