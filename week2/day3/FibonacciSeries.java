package week2.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Fibonacci Series");
		int n = 8;
		int first =0, second = 1;
		
		for(int i = 1; i<=n; i++)
		{
			System.out.println(first+"");
			int next = first + second;
			first = second;
			second = next;
		}
	}

}
