package ex03_method;

public class TimesTable {
	void showTable(int num) {
		System.out.println(num + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

	}

}
