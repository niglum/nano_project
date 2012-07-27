public class Bank {
	int summ;

	public Bank(int begin_capital) {
		this.summ = begin_capital;

	}

	void getSumm() {
		int s = (int) (this.summ * Math.random());
		System.out.println("Summ out = " + s);
		summ -= s;
	}
}
