import java.util.Scanner;

public class cubic {
	public static int cubic (int n)
	{
		int sum = 0;
		for (int j = 0; j<n; j++ ) {
			for (int k = 0; k< n; k++) {
				for (int l = 0; l<n; l++) {
					sum += j*k/(l+1);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n=scan.nextInt();
		System.out.println("Sum is: " +cubic(n));

	}
}