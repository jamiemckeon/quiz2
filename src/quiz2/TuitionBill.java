package quiz2;

public class TuitionBill {
	public double getTuitioncost() {
		return tuitioncost;
	}

	public double getPercentincrease() {

		return percentincrease;
	}

	public double getApr() {

		return apr;
	}

	public double getYears() {

		return years;
	}

	private double tuitioncost;
	private double percentincrease;
	private double apr;
	private double years;

	public TuitionBill(double tuitioncost, double percentincrease, double apr, double years) {
		this.tuitioncost = tuitioncost;
		this.percentincrease = percentincrease;
		this.apr = apr;
		this.years = years;
	}

	public double fullTuition() {
		double total = tuitioncost;
		double increase = tuitioncost;

		for (int a = 1; a < 5; a++) {

			if (a > 1) {
				increase = increase + (increase * (percentincrease));
				total = total + increase;

			}

		}
		total = total + (((total / years) * apr) * years);
		// System.out.println(total);
		total = Math.floor(total * 100) / 100;
		return total;
	}
}
