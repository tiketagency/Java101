package friday.vattaxcalculator.enums;

public enum CurrencyCourse {
	BRITISH_POUND(2.7048), EURO(1.95), AUSTRALIAN_DOLLAR(1.28);
	private double course;

	private CurrencyCourse(double course) {
		this.course = course;
	}

	public double getCourse() {
		return course;
	}
}