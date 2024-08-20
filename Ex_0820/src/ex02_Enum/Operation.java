package ex02_Enum;

public enum Operation {
	// public static final Operation PLUS = new Operation();
	// 추상메서드가 정의되면 상수객체에서 반드시 재정의해야한다.
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x+y;
		}
	},
	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			return x-y;
		}
	},
	MULTI("*") {
		@Override
		public double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			return x/y;
		}
	};

	private String op;
	// 생성자를 호출할 때 전달 한 인바를 받는 생성자를 정의해야 한다.

	Operation(String op) {
		this.op = op;
	}

	// private으로 설정된 필드의 값을 외부에서 보기 위해 메서드를 사용한다.
	// getter
	public String getOp() {
		return op;
	}

	public abstract double apply(double x,double y);
		
	}
