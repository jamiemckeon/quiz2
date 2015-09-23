package quiz2;
import java.util.Scanner;

public class TuitionRun {
		
	static Scanner inputs = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your Tuition cost:");
		double tuitioncost = inputs.nextDouble();
		System.out.println("Enter your percentage increase for tuition as a decimal:");
		double percentin = inputs.nextDouble();
		System.out.println("Enter your APR as a decimal:");
		double apr = inputs.nextDouble();
		System.out.println("Enter your payment term in years:");
		double term = inputs.nextDouble();
		TuitionBill newbill = new TuitionBill(tuitioncost, percentin, apr, term);
		System.out.println("Your expected time in years to pay off loans " + (newbill.fullTuition()));

	}
}
