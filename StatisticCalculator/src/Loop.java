import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		int number[] = new int[4];
		int frequency[]= new int[4];
		int sum=0;
		Scanner scan = new Scanner(System.in);
		//read in 10 numbers
		int evaluate;
		for (int i=0; i<number.length;i++) {
			System.out.print("Enter number " + (i+1));
			number[i] = scan.nextInt();
		}
		//compare to the previous
		//note to review number is large
		for (int i=0; i<number.length; i++) {
			evaluate =number[i];
			for(int j=0; j<number.length; j++) {
				if (evaluate==number[j]) {
					frequency[j]++;
				}
			}
		}
		
		for(int i=0; i<frequency.length; i++) {
			System.out.println(frequency[i]);
		}
	}

}
