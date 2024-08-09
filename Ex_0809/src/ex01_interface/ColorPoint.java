package ex01_interface;

public class ColorPoint extends Point {
	String color;

	public ColorPoint Point(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);

	}

	public void setColor(String color) {
		this.color = color;

	}

	public String toString() {
		return color+"식의 ("+get x()+","+get y()+")의점";
	}

}
