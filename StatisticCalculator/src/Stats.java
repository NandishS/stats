import java.util.Scanner;

public class Stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[10];
		int frequency[]= new int[10];
//		int number[] = {1,2,2,2,2,2,3,4,5,6};
		int sum = 0;
		int mode = 0;
		double average = 0;
		String option = "sum";
		Scanner scan = new Scanner(System.in);
		do  {
			System.out.print("Enter option:");
			option = scan.next();
			switch (option) {
			case "sum":
				for (int i=0; i<number.length;i++) {
					System.out.print("Enter number " + (i+1));
					number[i] = scan.nextInt();
					sum=sum+number[i];
				}
				System.out.println("The sum is " + sum);
				break;
			case "average":
				for (int i=0; i<number.length;i++) {
					System.out.print("Enter number " + (i+1));
					number[i] = scan.nextInt();
					sum=sum+number[i];
				}
				System.out.println("The average is " + sum/number.length);
				break;
			case "mode":
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
				System.out.println("The mode is " + mode);
				break;
			case "exit":
				System.exit(0);
				break;
			default:
				System.out
						.println("Please select from \"sum\",\"average\",\"mode,\"exit\" , sum is the default. ");
			}
		} while (!option.equals("exit"));
	}

}
