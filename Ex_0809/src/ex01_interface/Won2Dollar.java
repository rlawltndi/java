package ex01_interface;

public class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double converter(double src) {

		return src/ratio;
	}

	@Override
	protected String getDestString() {

		return "달러";
	}

	@Override
	protected String getSrcString() {

		return "원";
	}

}