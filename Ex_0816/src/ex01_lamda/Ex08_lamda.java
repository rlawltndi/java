package ex01_lamda;

@FunctionalInterface
interface IAdd {
	int add(int x, int y);
}

class MathUtils {
	public static int AddElement(int x, int y) {
		return x + y;
	}
}

public class Ex08_lamda {
	public static void main(String[] args) {
		//IAdd addLAdd = (x, y) -> MathUtils.AddElement(x, y);
		IAdd addLAdd = MathUtils::AddElement;//참조
		System.out.println(addLAdd.add(10, 20));

	}

}
